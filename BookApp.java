package dz.rmz.bookhandler;

public class BookApp {
    public static void main(String[] args) {

        Books books = Books.getInstance();

        Book firstBook = new Book("The Whispering Shadows", "Evelyn Harper", "978-1-2345-6789-0", 14.99);
        Book secondBook = new Book("Echoes of the Forgotten", "Marcus Trent", "978-0-9876-5432-1", 19.99);

        Book thirdBook = new Book("The Crimson Horizon", "Lila Monroe", "978-3-4567-8901-2");

        System.out.println("--------------------USING DISPLAY METHOD--------------------");
        firstBook.display();
        secondBook.display();
        thirdBook.display();
        System.out.println("--------------------USING DISPLAY METHOD--------------------");

        System.out.println("--------------------USING toString METHOD--------------------");
        System.out.println(firstBook);
        System.out.println(secondBook);
        System.out.println(thirdBook);
        System.out.println("--------------------USING toString METHOD--------------------");

        System.out.println("Total number of books: " + books.getBooksCount());
        System.out.println("Library's name: " + Book.getBookStore());

    }
}