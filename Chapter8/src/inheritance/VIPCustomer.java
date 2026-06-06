package inheritance;

public class VIPCustomer {
    private int customerId;
    private String customerName;
    private String customerGrade;
    private int bonusPoint;
    private double bonusRatio;

    private int agentId;
    private double saleRatio;

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int calculatePrice(int price) {
        bonusPoint += price * bonusRatio;
        int discount = (int) Math.round(price * saleRatio);
        return price - discount;
    }

    public int getAgentId() {
        return agentId;
    }

    public String showCustomerInfo() {
        return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
}
