public class Main {
    public static void main(String[] args) {

        Product prodotto = new Product("pizza", 5, 2.0f);
        System.out.println(prodotto.getTotalPrice());

        Product prodotto1 = new Product("Asparago", 3, 0.5f);
        System.out.println(prodotto1.getTotalPrice());

        Product prodotto2 = prodotto.extract(2);
        System.out.println(prodotto.getTotalPrice());
        System.out.println(prodotto2.getTotalPrice());

        DiscountedProduct discountedPizza = new DiscountedProduct("Pizza", 5, 2.0f, 30.0f);
        System.out.println(discountedPizza.getTotalPrice());

        Supermarket esseNon = new Supermarket(3,10);
        Product asparagiEsseNon = prodotto1.extract(2);
        esseNon.add(asparagiEsseNon);
        System.out.println(esseNon);
        Cart esseNonBuyer = new Cart(50,3);
        esseNon.buy(esseNonBuyer,asparagiEsseNon,1);
        System.out.println(esseNonBuyer);
        System.out.println(esseNon);
        esseNon.buy(esseNonBuyer,asparagiEsseNon,1);
        System.out.println(esseNonBuyer);
        System.out.println(esseNon);


    }
}