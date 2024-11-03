package classwork_36_31_10.iList.model;

public interface IList <E> extends Iterable <E> {//<E> - элемент листа (может быть любая заглавная буква лат.алф, но обычно используют 4 буквы E, V...
//методы на почти все случаи жизни
    int size ();
    default boolean isEmpty (){
        return size() == 0;
    };

    void clean ();//полностью удаляем объект, очищаем память

    boolean add (E element);//добавляем элемент

    default boolean contain (Object o){
        return indexOf(o)>=0;
    };

    default boolean remove (Object o){
        int index = indexOf(o);
        if (index < 0){
            return false;
        }
        remove(index);
        return true;
    };//удаляем только часть обьекта

    boolean add (int index, E element);//на какой индекс добавляем элемент

    E remove (int index);

    E get(int index);

    E set (int index, E element);

    int indexOf (Object o);//ищет с лева на право

    int lastIndexOf (Object o);//ищет с права на лево


}
