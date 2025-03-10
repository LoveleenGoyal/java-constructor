public class Product {

    // Instance variables
    private final String productName;
    private final double price;

    // Class variable
    private static int totalProducts = 0;

    // Constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs" + price);
    }

    // Class method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }


    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200.50);
        Product p2 = new Product("Smartphone", 799.99);

        System.out.println("Product details: ");
        p1.displayProductDetails();
        p2.displayProductDetails();
        System.out.println();

        // Display total number of products
        Product.displayTotalProducts();

    }
}
