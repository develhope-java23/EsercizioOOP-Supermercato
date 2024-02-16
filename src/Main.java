public class Main {
    public static void main(String[] args) {

        Product prodotto = new Product("pizza", 5, 2.0f);
        System.out.println(prodotto.getTotalPrice());

        Product prodotto1 = new Product("Asparago", 3, 0.5f);
        System.out.println(prodotto1.getTotalPrice());

        Product prodotto2 = prodotto.extract(2);
        System.out.println(prodotto.getTotalPrice());
        System.out.println(prodotto2.getTotalPrice());
    }
}