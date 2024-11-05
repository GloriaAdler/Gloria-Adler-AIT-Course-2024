package classwork_39_5_11.hash.ihash_set;

import java.util.Iterator;
import java.util.LinkedList;

public class MyHashSet <E> implements ISet<E> {
    // fields
    private LinkedList<E>[] hashset; // это массив связных листов (buckets - корзины)
    private int size; // общее кол-во элементов в set
    private int capacity; // кол-во ячеек, "гвоздики для цепочек элементов", 16,32,64...
    private double loadFactor; // загрузка "цепочек"

    // O(1)
    // constructor
    public MyHashSet(int capacity, double loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        hashset = new LinkedList[capacity];
    }

    // O(1)
    public MyHashSet(int capacity) {
        this(capacity, 0.75);
    }

    public MyHashSet(){
        this(16); // длина массива LinkedList<E>[] hashset
    }

    @Override
    public boolean addElement(E element) {
        if(size >= loadFactor * capacity ) { // не хватило места // O(1)
            rebuildArray(); // увеличиваем
        }
        int index = getIndex(element);//ищем номер корзины
        if (hashset[index] == null) { // если индекс не занять
            hashset[index] = new LinkedList<>(); // создаем новый элемент массива листов
        }
        if (hashset[index].contains(element)) {
            return false; // следим за уникальностью элементов
        }
        hashset[index].add(element); // добавляем элемент
        size++;
        return true;
    }

    // O(1)
    private void rebuildArray(){
        capacity = capacity << 1; //увеличили capacity в 2 раза
        LinkedList<E>[] newHashset = new LinkedList[capacity]; // переопределяем массив связных листов, увеличиваем capacity
        // надо обежать весь массив связных листов, залезть в каждый его LinkedList, переложить элементы в новый
        for (int i = 0; i < hashset.length; i++) {
            if (hashset[i] != null) {
                for (E e : hashset[i]) {
                    int index = getIndex(e);
                    if (newHashset[index] == null) {
                        newHashset[index] = new LinkedList<>(); // создаем новый лист
                    }
                    newHashset[index].add(e); // добавляем элемент в LinkedList
                }
            }
        }
        hashset = newHashset; // garbage collector очищает память
    }

    private int getIndex(Object o){//вычисляем номер корзины
        int hashcode = o.hashCode(); // вычисление hashCode
        hashcode = hashcode >=0 ? hashcode : -hashcode; // тернарный оператор, делаем положительным
        return hashcode % capacity; // деление с остатком
    }

    // O(1)
    @Override
    public boolean contains(Object o) {
        int index = getIndex(o);
        if(hashset[index] == null) {
            return false;
        }
        return hashset[index].contains(o); // проверяем наличие элемента
    }

    // O(1)
    @Override
    public boolean remove(Object o) {
        int index = getIndex(o);
        if(hashset[index] == null){
            return false;
        }
        boolean res = hashset[index].remove(o);
        if(res){
            size--;
        }
        return res;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int totalCounter;
            int i;
            int j;

            @Override
            public boolean hasNext() {
                return totalCounter < size;
            }

            @Override
            public E next() {
                while(hashset[i] == null || hashset[i].isEmpty()){
                    i++;
                }
                E res = hashset[i].get(j);
                totalCounter++; // сдвинули курсор
                if(j < hashset[i].size() - 1){ // почему -1?
                    j++;
                } else {
                    i++;
                    j=0;
                }
                return res;
            }
        };
    }
}
