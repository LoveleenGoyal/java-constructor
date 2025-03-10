class LibraryBooks {
    private final String title;
    private final String author;
    private final double price;
    private boolean isAvailable;

    // Default Constructor
    public LibraryBooks() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.isAvailable = true;
    }

    // Parameterized Constructor
    public LibraryBooks(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed \"" + title + "\".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently unavailable.");
        }
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + (isAvailable ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        // Creating book objects
        LibraryBooks defaultBook = new LibraryBooks();
        System.out.println("Default Book in library: ");
        defaultBook.displayBook();
        LibraryBooks book1 = new LibraryBooks("The Alchemist", "Paulo Coelho", 1590.99, true);
        LibraryBooks book2 = new LibraryBooks("1984", "George Orwell", 1200.49, false);

        // Displaying book details
        System.out.println("\nAvailable Books:");
        book1.displayBook();
        book2.displayBook();

        // Borrowing books
        System.out.println("\nBorrowing Books:");
        book1.borrowBook();
        book2.borrowBook();

        // Display updated availability
        System.out.println("\nUpdated Book Status:");
        book1.displayBook();
        book2.displayBook();
    }
}
