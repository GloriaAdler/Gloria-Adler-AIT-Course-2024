package homework_18_10.book;

import homework_18_10.book.model.Library;
import homework_18_10.book.model.Book;

public class LibraryAppl {
    public static void main(String[] args) {

        Book[] books = new Book[6];

        books[0] = new Book("1984", "Oruell", 1_111_111_111_110L, 2010);
        books[1] = new Book("T1", "A1", 1_111_111_111_111L, 2011);
        books[2] = new Book("T2", "A2", 1_111_111_111_112L, 2012);
        books[3] = new Book("T3", "A3", 1_111_111_111_113L, 2013);

        Library library = new Library(6);//library - знает все методы из класса Library

        for (int i = 0; i < books.length - 2; i++) {//books.length - 2 - потому что массив на 6, а книг 4
            library.addBook(books[i]);
        }
        library.printBooks(); //печать есть уже в методе, поэтому только метод без sout
        System.out.println(library.size());//через sout, так как library.size() как метод не имеет собственной печати

        Book newBook = new Book("War and Peace", "L.N. Tolstoi", 1_111_111_111_114L, 2000);
        library.addBook(newBook);//добавляем книгу
        System.out.println("===============================");
        library.printBooks();
        System.out.println(library.size());

        library.removeBook(1_111_111_111_111L);
        System.out.println("===============================");
        library.printBooks();
        System.out.println(library.size());



    }
}
