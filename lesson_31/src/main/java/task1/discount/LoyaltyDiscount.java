package task1.discount;

public class LoyaltyDiscount implements DiscountStrategy {

    @Override
    public double applyDiscount(double price) {
        return price * 0.9; // 10% discount for loyal customers
    }
}
