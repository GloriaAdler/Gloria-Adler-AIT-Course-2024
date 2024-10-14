package classwork_14_10.book_library.test;

import classwork_14_10.book_library.controller.Library;
import classwork_14_10.book_library.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    Library library;

    Book[] books;
    int size = 0;

    @BeforeEach
    void setUp() {

        library = new Library(5);
        //тестовый набор данных, отрабатывается BeforeEach
        books[0] = new Book("1984", "Oruell", 1_111_111_111_110L, 2010);
        books[1] = new Book("T1", "A1", 1_111_111_111_111L, 2011);
        books[2] = new Book("T2", "A2", 1_111_111_111_112L, 2012);
        books[3] = new Book("T3", "A3", 1_111_111_111_113L, 2013);

        //TODO
        //положить объекты в массив, который "внутри" объекта library

    }

    @Test
    void findBookTest(){
        Book foundBook = library.findBook(1_111_111_111_110L);// то что мы ожидаем
        assertEquals(books[0], library.findBook(1_111_111_111_110L));//find existed book
        assertNull(library.findBook(1_111_111_111_119L));//find absent book

    }

}