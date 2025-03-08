package dz.rmz.bookhandler;

import java.util.ArrayList;

public class Books {

    private final ArrayList<Book> books = new ArrayList<>();
    private static Books instance;

    private Books(){
        instance = this;
    }

    public static Books getInstance(){
        return instance == null ? new Books() : instance;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    public int getBooksCount(){
        return books.size();
    }

}
