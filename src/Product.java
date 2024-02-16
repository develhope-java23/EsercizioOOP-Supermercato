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

    public Product extract(int quantity){

        if (quantity > this.quantity){
            System.out.println("Err");
            return null;
        }

        this.quantity -= quantity;

        return new Product(this.name, quantity, this.price);
    }
}
