package homework_44_12_11.book;

import java.util.Arrays;
import java.util.List;

public class BookAppl {

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(

                new Book("Title 1", "AAA", 1_111_111_111_110L, 2010, 5.5),
                new Book("Title 2", "BBB", 1_111_111_111_111L, 2020, 8),
                new Book("Title 3", "CCC", 1_111_111_111_112L, 2022, 12),
                new Book("Title 4", "BBB", 1_111_111_111_113L, 2020, 5.5),
                new Book("Title 5", "AAA", 1_111_111_111_114L, 2018, 8)
        );

        BookMethods bookMethods = new BookMethods(books);

        System.out.println("All Books: ");
        bookMethods.displayAllBooks();
        System.out.println();

        System.out.println("Title: ");
        bookMethods.displayBooksByTitle("Title 1");
        System.out.println();

        System.out.println("Books are more expensive than 8: ");
        bookMethods.displayBooksByPrice(8);
        System.out.println();

        System.out.println("Book, released from 2020 to 2024: ");
        bookMethods.displayBooksByRangeYear(2018,2022);
        System.out.println();

        System.out.println("Descending price: ");
        bookMethods.displayBooksByDescendingPrice();
        System.out.println();

        System.out.println("Average price: " + bookMethods.displayBooksByAveragePrice());
        System.out.println();

        System.out.println("Author is AAA: ");
        bookMethods.displayBooksByAuthor("AAA");


    }
}
