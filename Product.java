public class Product {
    private String productName;
    private int productId;
    private double productPrice;
    private String productDescription;
    private String productCategory;

    // Constructor
    public Product(String productName, int productId, double productPrice, String productDescription, String productCategory) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.productCategory = productCategory;
    }

    // Getters for all fields
    public String getProductName() {
        return productName;
    }

    public int getProductId() {
        return productId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getProductCategory() {
        return productCategory;
    }

    @Override
    public String toString() {
        return "{" +
                "productName='" + productName + '\'' +
                ", productId=" + productId +
                ", productPrice=" + productPrice +
                ", productDescription='" + productDescription + '\'' +
                ", productCategory='" + productCategory + '\'' +
                '}';
    }
}
