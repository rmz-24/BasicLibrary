package dz.rmz.bookhandler;

public class Book {

    Books books = Books.getInstance();

    private final String TITLE;
    private final String AUTHOR;
    private final String ISBN;
    private double price;

    private static final String BOOK_STORE = "MY LIBRARY";

    public Book(String title, String author, String ISBN, double price) {
        this.TITLE = title;
        this.AUTHOR = author;
        this.ISBN = ISBN;
        this.price = price;
        books.addBook(this);
    }

    public Book(String title, String author, String ISBN) {
        this.TITLE = title;
        this.AUTHOR = author;
        this.ISBN = ISBN;
        this.price = 0;
        books.addBook(this);
    }

    public String getTitle() {
        return TITLE;
    }

    public String getAuthor() {
        return AUTHOR;
    }

    public String getISBN() {
        return ISBN;
    }

    public double getPrice() {
        return price;
    }

    public static String getBookStore(){
        return BOOK_STORE;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display(){
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + getISBN());
        System.out.println("Price: " + getPrice());
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return String.format("Title: %s, Author: %s, ISBN: %s, Price: %.2f", getTitle(), getAuthor(), getISBN(), getPrice());
    }

}
