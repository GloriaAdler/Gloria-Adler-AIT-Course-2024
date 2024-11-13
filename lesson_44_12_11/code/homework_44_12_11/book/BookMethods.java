package homework_44_12_11.book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookMethods {

    private List<Book> books;

    public BookMethods (List<Book> books){
        this.books = new ArrayList<>(books);
    }

    //отобразить все книги;
    public void displayAllBooks (){
        books.forEach(System.out::println);
    }

    //отобразить по указанному названию;
    public void displayBooksByTitle (String title){
        books.stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(title))
                .forEach(System.out::println);
    }

    //отобразить книги дороже указанной цены;
    public void displayBooksByPrice (double price){
        books.stream()
                .filter(book -> book.getPrice() > price)
                .forEach(System.out::println);
    }

    //отобразить книги, чей год выпуска находится в заданном диапазоне;
    public void displayBooksByRangeYear (int startYear, int endYear){
        books.stream()
                .filter(book -> book.getYear() >= startYear && book.getYear()<=endYear)
                .forEach(System.out::println);
    }

    //отсортировать книги в порядке убывания стоимости;
    public void displayBooksByDescendingPrice (){
        books.sort(Comparator.comparingDouble(Book::getPrice).reversed());//reversed - перевернет стандартную сортировку от меньшего к большему, т.е. будет от больщего в меньшему.
        displayAllBooks();
    }

    //получить среднюю стоимость книги из созданного набора;
    public double displayBooksByAveragePrice (){
        return books.stream()
                .mapToDouble(Book::getPrice)
                .average()
                .orElse(0);
    }

    //сколько и конкретно какие авторы у книг.
    public void displayBooksByAuthor (String author){
        List <Book> filterBooks = books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
        System.out.println("Number of authors " + author + ": " + filterBooks.size());
        filterBooks.forEach(System.out::println);
    }



}
