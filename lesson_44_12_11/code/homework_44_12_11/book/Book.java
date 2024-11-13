package homework_44_12_11.book;

public class Book {

    private String title;
    private String author;
    private long isbn;
    private int year;
    private double price;

    public Book(String title, String author, long isbn, int year, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public long getIsbn() {
        return isbn;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", isbn=").append(isbn);
        sb.append(", year=").append(year);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
