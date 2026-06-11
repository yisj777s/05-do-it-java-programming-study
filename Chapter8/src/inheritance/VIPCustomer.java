package inheritance;

public class VIPCustomer extends Customer {
    private int agentId;
    private double saleRatio;

//    public VIPCustomer() {
//        customerGrade = "VIP";
//        bonusRatio = 0.05;
//        saleRatio = 0.1;
//        System.out.println("VIPCustomer() 생성자 호출");
//    }

    public VIPCustomer(int customerId, String customerName, int agentId) {
        super(customerId, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentId = agentId;
        System.out.println("VIPCustomer(int, String, int) 생성자 호출");
    }

    public int getAgentId() {
        return agentId;
    }
}
