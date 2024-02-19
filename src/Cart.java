public class Cart {

    private Product[] productsInCart;
    private float budget;

   public Cart(float budget, int maxProdCount){
       this.budget = budget;
       this.productsInCart = new Product[maxProdCount];
   }
}


