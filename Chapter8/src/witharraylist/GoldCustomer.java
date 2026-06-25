package witharraylist;

import polymorphism.Customer;

public class GoldCustomer extends Customer {
    protected double discountRate;

    public GoldCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        customerGrade = "GOLD";
        bonusRate = 0.02;
        discountRate = 0.1;
    }

    @Override
    public int calculatePrice(int price) {
        bonusPoint += price * bonusRate;
        return price - (int) (price * discountRate);
    }
}
