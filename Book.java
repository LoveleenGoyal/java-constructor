public class Book {
    private final String title;
    private final String author;
    private final double price;

    // Default constructor
    public Book() {
        title = "Pride & Prejudice";
        author = "Jane Austen";
        price = 959.00;
    }

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.author = author;
        this.price = price;
        this.title = title;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author name: " + author);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Harry Potter", "J K Rowling", 1599.90);

        System.out.println("----Book 1 Details----");
        book1.displayBookDetails();
        System.out.println("----Book 2 Details----");
        book2.displayBookDetails();
    }
}
/*
----Book 1 Details----
Title: Pride & Prejudice
Author name: Jane Austen
Price: 959.0
----Book 2 Details----
Title: Harry Potter
Author name: J K Rowling
Price: 1599.9
*/

