public class Product {
    private String productName;
    private String producerName;
    private double price;

    public Product(String productName, String producerName, double price) {
        this.productName = productName;
        this.producerName = producerName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getProducerName() {
        return producerName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", producerName='" + producerName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
