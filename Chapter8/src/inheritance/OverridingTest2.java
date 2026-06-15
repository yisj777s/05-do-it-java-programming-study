package inheritance;

public class OverridingTest2 {
    public static void main(String[] args) {
        Customer vipCustomer = new VIPCustomer(10030, "나몰라", 2000);
        vipCustomer.bonusPoint = 1000;

        System.out.println(vipCustomer.getCustomerName() + "님이 지불해야 하는 금액은 "
                + vipCustomer.calculatePrice(10000) + "원입니다.");
    }
}
