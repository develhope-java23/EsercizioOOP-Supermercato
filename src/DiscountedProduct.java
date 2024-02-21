public class DiscountedProduct extends Product {
    private float discount;

    public DiscountedProduct(String name, int quantity, float price, float discount,ProductCategory category) {
        super(name, quantity, price,category);
        this.discount = discount;
    }

    public float getTotalPrice() {
        float originalPrice = super.getTotalPrice();
        float discountedPrice = originalPrice * (1 - discount / 100);
        return discountedPrice;
    }
}
