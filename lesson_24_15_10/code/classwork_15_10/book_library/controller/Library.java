package classwork_15_10.book_library.controller;
//Реализовать методы:
//- печать списка всех книг в библиотеке;+
//- получение кол-ва книг в библиотеке;+
//- поиска книги по ISBN;+
//- добавление книги в библиотеку с учетом требований:
//  - не добавлять null
//  - не добавлять дубликат
//  - не добавлять больше, чем может вместить в себя библиотека.
//- удаление книги из библиотеки.

import classwork_15_10.book_library.model.Book;

public class Library {

    //fields
    private Book[] books; //массив это сущьность объектов. Сколько потенциально может быть книг в библиотеке, длина массива никогда не может показать, сколько индексов в реальности занято, так как все не занятые индексы будут заполнены null - пустыми ссылками
    private int size; //сколько в реальности книг в библиотеке. Текущея заполненность массива сущностями
    //constructor

    public Library(int capacity) {//capacity - вместимость, создаем конструктор и переделываем под нас
        this.books = new Book[capacity];
        this.size = 0;
    }

    //CRUD methods
//boolean addBook
    public boolean addBook (Book book){
        //negative cases
        if (book == null){
            return false;
        }
        if (size == books.length){
            return false;
        }
        if (!((findBook(book.getIsbn()) == null))){//найденная книжка не равна null
            return false;
        }

        //positive case
        books[size] = book;//ставим книгу в конец массива, на первое свободное место
        size++;
        return true;
    }

//size++
    public int size (){
        return size;
    }

//void printBooks - просто информационный метод
    public void printBooks (){
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

//Book findBook
    public Book findBook(long isbn){
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn){
                return books[i];
            }
        }
        return null;
    }
//removeBook
    public Book removeBook (long isbn){
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn){
                Book victim = books [i];
                books[i] = books[size-1];//last book put instead victim - последнюю книгу поставил вместо жертвы
                books[size-1] = null;//затираем последний элемент массива и уменьшаем size
                size--;
                return victim;
            }
        }
        return null;
    }

//boolean updateBook()



}
