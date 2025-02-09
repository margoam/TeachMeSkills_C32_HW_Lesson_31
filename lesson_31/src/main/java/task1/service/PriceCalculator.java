package task1.service;

import task1.discount.DiscountStrategy;

public class PriceCalculator {

    private DiscountStrategy strategy;

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculatePrice(double price) {
        if (strategy == null) return price;
        return strategy.applyDiscount(price);
    }
}
