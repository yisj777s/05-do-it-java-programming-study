package inheritance;

public class OverridingTest3 {
    public static void main(String[] args) {
        int price = 10000;

        Customer customerLee = new Customer(10010, "이순신");
        System.out.println(customerLee.getCustomerName() + " 님이 지불해야 하는 금액은 "
                + customerLee.calculatePrice(price) + "원입니다.");

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
        System.out.println(customerKim.getCustomerName() + " 님이 지불해야 하는 금액은 "
                + customerKim.calculatePrice(price) + "원입니다.");

        Customer VIPcustomer = new VIPCustomer(10030, "나몰라", 2000);
        System.out.println(VIPcustomer.getCustomerName() + " 님이 지불해야 하는 금액은 "
                + VIPcustomer.calculatePrice(price) + "원입니다.");
    }
}
