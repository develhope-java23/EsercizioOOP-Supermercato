public class Main {
    public static void main(String[] args) {

        Product prodotto = new Product("pizza", 5, 2.0f, ProductCategory.FOOD);
        System.out.println(prodotto.getTotalPrice());

        Product prodotto1 = new Product("Asparago", 10, 0.5f, ProductCategory.FOOD);
        System.out.println(prodotto1.getTotalPrice());

        Product prodotto2 = prodotto.extract(2);
        System.out.println(prodotto.getTotalPrice());
        System.out.println(prodotto2.getTotalPrice());


        Cart carrello = new Cart(50, 5);
        carrello.addProduct(prodotto);
        carrello.addProduct(prodotto1);
        System.out.println("Nel carrello ci sono: " + carrello);
        System.out.println("Final Checkout = " + carrello.getTotalPrice());

        DiscountedProduct discountedPizza = new DiscountedProduct("Pizza", 5, 2.0f, 30.0f, ProductCategory.FOOD);

        System.out.println(discountedPizza.getTotalPrice());

        Supermarket esseNon = new Supermarket(3, 10);
        Product asparagiEsseNon = prodotto1.extract(2);
        esseNon.add(asparagiEsseNon);
        System.out.println(esseNon);
        esseNon.add(asparagiEsseNon);
        System.out.println(esseNon);
        esseNon.add(asparagiEsseNon);
        System.out.println(esseNon);

        Cart esseNonBuyer = new Cart(50, 3);
        esseNon.buy(esseNonBuyer, asparagiEsseNon, 1);
        System.out.println(esseNonBuyer);
        System.out.println(esseNon);
        esseNon.buy(esseNonBuyer, asparagiEsseNon, 3);
        System.out.println(esseNonBuyer);
        System.out.println(esseNon);


    }
}