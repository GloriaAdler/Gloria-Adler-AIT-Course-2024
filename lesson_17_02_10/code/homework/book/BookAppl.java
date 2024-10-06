package homework.book;

import homework.book.model.Book;

public class BookAppl {
    public static void main(String[] args) {
        Book book1 = new Book("978-3-19-601081-1", "Schritte plus", "Franz Specht", 2022, "Kurs- und Arbeitsbuch");
        book1.display();
    }
}
