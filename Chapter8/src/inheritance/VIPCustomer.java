package inheritance;

public class VIPCustomer extends Customer {
    private int agentId;
    private double saleRatio;

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int getAgentId() {
        return agentId;
    }
}
