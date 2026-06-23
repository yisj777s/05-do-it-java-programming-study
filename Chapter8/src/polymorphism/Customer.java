package polymorphism;

public class Customer {
    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

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
        bonusRatio = 0.01;
    }

    public int calculatePrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String getCustomerInfo() {
        return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " +
                bonusPoint + "입니다.";
    }
}