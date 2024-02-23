import java.util.Arrays;
import java.util.Objects;

public class Supermarket {
    Product[] stock;
    private int emptySpace;

    public Supermarket(int maxProducts, int maxSpace) {
        this.stock = new Product[maxProducts];
        this.emptySpace = maxSpace;
    }

    @Override
    public String toString() {
        return "Supermarket{" + "stock=" + Arrays.toString(stock) + ", emptySpace=" + emptySpace + '}';
    }

    public void add(Product product) {
        if (this.emptySpace < product.getQuantity()) {
            System.out.println("Non c'è abbastanza spazio libero in stock per i prodotti");
            return;
        }
        int productInStockIndex = getProductIndex(product);
        int emptyStock = findEmptyStock();
        if (emptyStock < 0 && productInStockIndex < 0) {
            System.out.println("Non c'è abbastanza spazio libero in stock per i prodotti");
            return;
        }
        if (productInStockIndex >= 0 && this.emptySpace >= product.getQuantity()) {
            emptySpace -= product.getQuantity();
            stock[productInStockIndex].addQuantity(product.getQuantity());
            return;
        }

        this.emptySpace -= product.getQuantity();
        stock[emptyStock] = product;


    }

    public void buy(Cart cart, Product product, int quantity) {
        int productIndex = getProductIndex(product);
        if (getProductIndex(product) < 0) {
            System.out.println("We are sorry to inform you that the product request is not present in our supermarket.");
            return;
        }
        if (stock[productIndex].getQuantity() < quantity) {
            System.out.println("We are sorry to inform you that we don't have this quantity available. In stock we have " + product.getQuantity() + "of this.");
            return;
        }
        if (getProductIndex(product) >= 0) {
            if (stock[productIndex].getQuantity() > quantity) {
                cart.addProduct(stock[productIndex].extract(quantity));
                emptySpace += quantity;
            } else if (stock[productIndex].getQuantity() == quantity) {
                cart.addProduct(stock[productIndex].extract(quantity));
                stock[productIndex] = null;
                emptySpace += quantity;
            }
        }
    }

    //return index of product if in stock, -1 if not
    private int getProductIndex(Product product) {
        for (int i = 0; i < this.stock.length; i++) {
            if (stock[i] != null && Objects.equals(stock[i].getName(), product.getName())) {
                return i;
            }
        }
        return -1;
    }

    private int findEmptyStock() {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] == null) {
                return i;
            }
        }
        return -1;
    }
}
