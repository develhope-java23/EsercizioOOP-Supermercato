public class Product {

    private String name;

    private int quantity;

    private float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public Product(String name, int quantity, float price) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public float getQuantity() {
        return quantity;
    }
    public String getName(){
        return name;
    }

    public void decreaseQuantity(int quantity) {
        this.quantity -= quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getTotalPrice() {

        return this.quantity * this.price;
    }

    public Product extract(int quantity) {

        if (quantity > this.quantity) {
            System.out.println("Err");
            return null;
        }

        this.quantity -= quantity;

        return new Product(this.name, quantity, this.price);
    }
}
