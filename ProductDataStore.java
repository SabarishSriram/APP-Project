import java.util.Arrays;
import java.util.List;

public class ProductDataStore {

    // Static list of products
    public static List<Product> products = Arrays.asList(
            new Product("Laptop", 101, 999.99, "High-performance laptop", "Electronics"),
            new Product("Smartphone", 102, 799.99, "Latest model smartphone", "Electronics"),
            new Product("Headphones", 103, 199.99, "Noise-canceling headphones", "Accessories"),
            new Product("Backpack", 104, 49.99, "Waterproof travel backpack", "Bags"),
            new Product("Desk Chair", 105, 129.99, "Ergonomic office chair", "Furniture")
    );

    // Method to retrieve all products
    public static List<Product> getProducts() {
        return products;
    }
}