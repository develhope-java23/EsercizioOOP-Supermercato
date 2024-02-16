public class Product {

    private String name;

    private int quantity;

    private float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }

    public Product(String name, int quantity, float price) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public float getTotalPrice() {

        return this.quantity * this.price;
    }
}
