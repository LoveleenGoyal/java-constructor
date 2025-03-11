class Book {
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter of author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Display book details
    public void displayBook() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    // Constructor
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }
    // Display ebook details
    public void displayEBook() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN);   // Public (accessible)
        System.out.println("Title: " + title); // Protected (accessible in subclass)
        System.out.println("Author: " + getAuthor()); // Private (Accessed via getter method)
    }
}

public class BookLibrary {
    public static void main(String[] args) {
        Book book1 = new Book("978-3-16-148410-0", "Java Programming", "James Gosling");
        book1.displayBook();

        // Modifying author using setter
        book1.setAuthor("Joshua Bloch");
        System.out.println("Updated Author: " + book1.getAuthor());

        // Creating an EBook object
        EBook ebook1 = new EBook("978-0-13-468599-1", "Effective Java", "Joshua Bloch");
        System.out.println();
        ebook1.displayEBook();
    }
}

/*
ISBN: 978-3-16-148410-0
Title: Java Programming
Author: James Gosling
Updated Author: Joshua Bloch

EBook Details:
ISBN: 978-0-13-468599-1
Title: Effective Java
Author: Joshua Bloch
*/
