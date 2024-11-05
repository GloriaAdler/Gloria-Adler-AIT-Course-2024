package classwork_39_5_11.hash.ihash_set;

public interface ISet <E> extends Iterable<E> {

    boolean addElement(E element);

    boolean contains (Object o);

    boolean remove(Object o);

    int size();
}
