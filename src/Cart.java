import java.util.Arrays;

public class Cart {

    private Product[] productsInCart;
    private float budget;

    private int lastFreeIndex;

    public Cart(float budget, int maxProdCount) {
        this.budget = budget;
        this.productsInCart = new Product[maxProdCount];
        this.lastFreeIndex = 0;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "productsInCart=" + Arrays.toString(productsInCart) +
                ", budget=" + budget +
                '}';
    }

    public float getTotalPrice() {
        float totalPrice = 0;
        for (int i = 0; i < productsInCart.length; i++) {
            Product temp = productsInCart[i];
            if (temp != null) {
                totalPrice += temp.getTotalPrice();
            }
        }
        return totalPrice;
    }

    public void addProduct(Product product) {
        if (lastFreeIndex >= productsInCart.length) {
            System.out.println("Too many products in the cart!");
            return;
        }
        if (getTotalPrice() + product.getTotalPrice() > budget) {
            System.out.println("OUT of Budget!");
            return;
        }
        productsInCart[lastFreeIndex] = product;
        lastFreeIndex++;
    }
}


