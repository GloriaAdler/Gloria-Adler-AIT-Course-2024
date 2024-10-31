package classwork_36_31_10.iList.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

//шаг увеличения массива 1,5
public class IListImpl implements IList{

    Object[] elements;
    private int size;

    //конструктор
    public IListImpl(int initialCapacity) {
        if (initialCapacity < 0){
            throw new IllegalArgumentException("Initial capacity" + initialCapacity);
        }
        this.elements = new Object[initialCapacity];
    }

    //конструктор
    public IListImpl (){
        this (10);//начальный массив на 10 элементов
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clean() {
        for (int i = 0; i < size; i++) {//проходим по всем элементам
            elements[i] = null;//... и говорим что они будут null
        }
        size = 0;
    }

    @Override
    public boolean add(Object element) {
        ensureCapacity();
        elements[size++] = element;
        return true;
    }

    private void ensureCapacity(){
        if (size == elements.length){
            if (size == Integer.MAX_VALUE){
                throw new OutOfMemoryError();
            }
            int newCapacity = elements.length + elements.length /2;//увеличили длина в 1,5 раза
            if (newCapacity < 0){
                newCapacity = Integer.MAX_VALUE;
            }
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    //ArrayList

    @Override
    public boolean add(int index, Object element) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
