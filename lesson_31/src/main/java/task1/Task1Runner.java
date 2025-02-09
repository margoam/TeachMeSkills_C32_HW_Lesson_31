package task1;

import task1.discount.FixedDiscount;
import task1.discount.LoyaltyDiscount;
import task1.discount.PercentageDiscount;
import task1.service.PriceCalculator;

public class Task1Runner {

    public static void runTask1() {
        PriceCalculator calculator = new PriceCalculator();
        calculator.setStrategy(new FixedDiscount(10));
        System.out.println("Fixed Discount: " + calculator.calculatePrice(100));

        calculator.setStrategy(new PercentageDiscount(15));
        System.out.println("Percentage Discount: " + calculator.calculatePrice(100));

        calculator.setStrategy(new LoyaltyDiscount());
        System.out.println("Loyalty Discount: " + calculator.calculatePrice(100));
    }
}
