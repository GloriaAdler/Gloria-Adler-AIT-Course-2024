package classwork_14_10.book_library.controller;

import classwork_14_10.book_library.model.Book;

public class Library {

    //fields
    private Book[] books; //сколько потенциально может быть книг в библиотеке, длина массива никогда не может показать, сколько индексов в реальности занято, так как все не занятые индексы будут заполнены null - пустыми ссылками
    private int size; //сколько в реальности книг в библиотеке
    //constructor

    public Library(int capacity) {//capacity - вместимость, создаем конструктор и переделываем под нас
        this.books = new Book[capacity];
        this.size = 0;
    }


    //CRUD methods

    //boolean addBook (Book book)
    //size++


    //void printBook - просто информационный метод


    public Book findBook(long isbn){
        Book foundBook = null;
        return foundBook;
    }



    //Book removeBook (long isbn)
    //size--


    //boolean updateBook()


    public int size(){
        return size;
    }


}
