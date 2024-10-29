package classwork_34_29_10.album.dao;
import classwork_34_29_10.album.model.Photo;
import java.time.LocalDate;

public interface Album {

    boolean addPhoto (Photo photo);

    boolean removePhoto (int photold, int albumid);

    boolean updatePhoto (int photold, int albumid, String url);

    Photo getPhotoFromAlbum (int photold, int albumid);

    Photo[] getAllPhotoFromAlbum (int albumld);

    Photo[] getPhotoBeetwenDate (LocalDate dateFrom, LocalDate dateTo);

    int size ();
}
