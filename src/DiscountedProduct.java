public class DiscountedProduct extends Product {
    private float discount;

    public DiscountedProduct(String name, int quantity, int price) {
        super(name, quantity, price);
        this.discount = discount;
    }

    public float getTotalPrice() {
        float originalPrice = super.getTotalPrice();
        float discountedPrice = originalPrice * (1 - discount);
        return discountedPrice;
    }
}
