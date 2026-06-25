package polymorphism;

public class VIPCustomer extends Customer {
    private int agentId;
    private double discountRate;

    public VIPCustomer(int customerId, String customerName, int agentId) {
        super(customerId, customerName);
        customerGrade = "VIP";
        bonusRate = 0.05;
        discountRate = 0.1;
        this.agentId = agentId;
    }

    @Override
    public int calculatePrice(int price) {
        bonusPoint += price * bonusRate;
        return price - (int) (price * discountRate);
    }

    @Override
    public String getCustomerInfo() {
        return super.getCustomerInfo() + "담당 상담원 아이디는 " + agentId + "입니다.";
    }

    public int getAgentId() {
        return agentId;
    }
}
