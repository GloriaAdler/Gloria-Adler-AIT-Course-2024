package classwork_15_10.book_library.test;

import classwork_15_10.book_library.controller.Library;
import classwork_15_10.book_library.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;//этой строкой импортируются все assert

class LibraryTest {

    Library library;

    Book[] books;
    int size = 0;

    @BeforeEach
    void setUp() {

        library = new Library(5);
        books = new Book[5];

        //тестовый набор данных, отрабатывается BeforeEach
        books[0] = new Book("1984", "Oruell", 1_111_111_111_110L, 2010);
        books[1] = new Book("T1", "A1", 1_111_111_111_111L, 2011);
        books[2] = new Book("T2", "A2", 1_111_111_111_112L, 2012);
        books[3] = new Book("T3", "A3", 1_111_111_111_113L, 2013);

        //TODO
        //положить объекты в массив, который "внутри" объекта library
        for (int i = 0; i < 4; i++) {//4 это кол-во книг на данный момент (size = 4), поэтому используем число, а не длину массива
            library.addBook(books[i]);
        }
    }

    //method addBook - boolean (true or false)
    @Test
    void addBookTest(){
        //- не добавлять null
        assertFalse (library.addBook (null));
        //- не добавлять дубликат
        assertFalse(library.addBook(books[0]));//можно указать индекс любой из имеющихся книг
        //добавляем еще одну книгу
        Book newBook = new Book("T4", "A4", 1_111_111_111_114L, 2024);
        assertTrue(library.addBook(newBook));
        assertEquals(5, library.size());
        //добавляем еще одну книгу сверх capacity (вместимости)
        Book oneMoreBook = new Book("T5", "A5", 1_111_111_111_115L, 2024);
        assertFalse(library.addBook(oneMoreBook));
    }

    @Test
    void findBookTest(){
        Book foundBook = library.findBook(1_111_111_111_110L);// то что мы ожидаем
        assertEquals(books[0], library.findBook(1_111_111_111_110L));//find existed book
        assertNull(library.findBook(1_111_111_111_119L));//find absent book
    }

    @Test
    void removeBookTest(){
        assertEquals(books[0], library.removeBook(1_111_111_111_110L));//сделали удаление существующей книги
        assertEquals(3, library.size());
        assertNull(library.removeBook(1_111_111_111_119L));//сделали удаление несуществующей книги
    }

    @Test
    void sizeTest(){
        assertEquals(4, library.size());
    }

    @Test
    void printBooksTest (){
        System.out.println("=====================================================");
        library.printBooks();
    }

    @Test
    void updateBooTest(){
        Book newBook = new Book("New book", "A4", 1_111_111_111_114L, 2025);
        library.addBook(newBook);
        //library.update
    }


}