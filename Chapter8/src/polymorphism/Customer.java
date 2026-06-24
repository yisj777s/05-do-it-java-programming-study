package polymorphism;

public class Customer {
    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusRate;

    public Customer() {
        initializeCustomer();
    }

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        initializeCustomer();
    }

    private void initializeCustomer() {
        customerGrade = "SILVER";
        bonusRate = 0.01;
    }

    public int calculatePrice(int price) {
        bonusPoint += price * bonusRate;
        return price;
    }

    public String getCustomerInfo() {
        return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " +
                bonusPoint + "입니다.";
    }
}