public class Product {
    private String name;

    private int quantity;

    private float price;

    private ProductCategory category;
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public Product(String name, int quantity, float price, ProductCategory category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category=category;
    }

    public float getTotalPrice() {

        return this.quantity * this.price;
    }

    public Product extract(int quantity){

        if (quantity > this.quantity){
            System.out.println("Err");
            return null;
        }

        this.quantity -= quantity;

        return new Product(this.name, quantity, this.price, this.category);
    }
}