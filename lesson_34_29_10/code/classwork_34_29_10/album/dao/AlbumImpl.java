package classwork_34_29_10.album.dao;

import classwork_34_29_10.album.model.Photo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class AlbumImpl implements Album {

    private Photo[] photos;
    private int size;

    public AlbumImpl(int capasity) {//конструктор корректируем под себя
        this.photos = new Photo[capasity];
        //this.size = 0;
    }

    // Comparator sort by albumId then by photoId
    //Comparator - для поддержания порядка в альбоме (поддерживаемая сортировка)
    Comparator <Photo> comparator = (p1, p2) -> {
        int res = Integer.compare(p1.getAlbumId(), p2.getAlbumId());
        return res !=0 ? res : Integer.compare(p1.getPhotoId(), p2.getPhotoId());
    };

    @Override
    public boolean addPhoto(Photo photo) {
        //негативные методы
        if (photo == null || size == photos.length){
            return false;
        }
        if(getPhotoFromAlbum(photo.getAlbumId(), photo.getPhotoId()) != null){
            return false;
        }

        //find index where insert photo - позитивные кейсы
        int index = Arrays.binarySearch(photos, 0,size, photo, comparator);
        index = index >= 0 ? index : -index -1;
        System.arraycopy(photos, index, photos, index + 1, size - index);
        photos[index] = photo;
        size++;
        return true;
    }

    @Override
    public boolean removePhoto(int albumId, int photoId) {
        for (int i = 0; i < size; i++) {
            if (photos[i].getAlbumId() == albumId && photos[i].getPhotoId() == photoId){
                System.arraycopy(photos, i+1, photos, i, size-i-1);
                photos[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePhoto(int albumId, int photoId, String url) {
        Photo photo = getPhotoFromAlbum(albumId, photoId);
        if (photo == null){//проверка: если photo не null, то сетим url
            return false;
        }
        photo.setUrl(url);
        return true;
    }

    @Override
    public Photo getPhotoFromAlbum(int albumId, int photoId) {
        for (int i = 0; i < size; i++) {
            if (photos[i].getAlbumId() == albumId && photos[i].getPhotoId() == photoId){
                return photos [i];
            }
        }
        return null;
    }

    // этот метод мы еще не реализовали
    @Override
    public Photo[] getAllPhotoFrom(int albumId) {
        return new Photo[0];
    }

    // этот метод мы еще не реализовали
    @Override
    public Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        return new Photo[0];
    }

    @Override
    public int size() {
        return size;
    }
}
