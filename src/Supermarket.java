import java.util.Arrays;

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
        int emptyStock = -1;
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] == null) {
                emptyStock = i;
                break;
            }
        }
        if (this.emptySpace >= product.getQuantity() && emptyStock >= 0) {
            stock[emptyStock] = product;
            this.emptySpace -= product.getQuantity();
        } else if (this.emptySpace < product.getQuantity()) {
            System.out.println("Non c'è abbastanza spazio libero per i prodotti");
        } else if (emptyStock < 0) {
            System.out.println("Non c'è abbastanza spazio libero per i prodotti");
        }
    }

    public void buy(Cart cart, Product productName, int quantity) {
        if (productInStock(productName) >= 0) {
            int productIndex = productInStock(productName);
            if (stock[productIndex].getQuantity() > quantity) {
                Product tempProduct = stock[productIndex];
                tempProduct.setQuantity(quantity);
                cart.addProduct(tempProduct);
                stock[productIndex].decreaseQuantity(quantity);
                emptySpace += quantity;
            } else if (stock[productIndex].getQuantity() == quantity) {
                Product tempProduct = stock[productIndex];
                tempProduct.setQuantity(quantity);
                cart.addProduct(tempProduct);
                stock[productIndex] = null;
                emptySpace += quantity;
            } else if (stock[productIndex].getQuantity() < quantity){
               return;
            }
        } else if (productInStock(productName) < 0){
            System.out.println("We are sorry to inform you that the product request is not present in our supermarket.");

        } else {
            System.out.println("Something went wrong. Code ERRORCART1");

        }
    }

    //return index of product if in stock, -1 if not
    public int productInStock(Product product) {
        for (int i = 0; i < this.stock.length; i++) {
            this.stock[i] = product;
            return i;
        }
        return -1;
    }

}
