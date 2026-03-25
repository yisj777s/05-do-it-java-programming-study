package exercise.q10;
import java.time.LocalDate;

/**
 * Q10.
 * 온라인 쇼핑몰에서 주문할 때 다음과 같이 주문 정보가 출력되도록 클래스를 정의하고 결괏값을 출력해 봅시다.
 */
public class Order {
    int orderNumber = 20260325;
    String userId = "abc1234";
    LocalDate orderDate = LocalDate.of(2026, 3, 25);
    String userName = "홍길동";
    String productNumber = "PD0345-12";
    String shippingAddress = "서울시 영등포구 여의도동 20번지";

    public static void main(String[] args) {
        Order order = new Order();

        order.showOrderInfo();
    }

    public void showOrderInfo() {
        System.out.println("주문 번호: " + orderNumber);
        System.out.println("주문자 아이디: " + userId);
        System.out.println("주문 날짜: " + orderDate);
        System.out.println("주문자 이름: " + userName);
        System.out.println("주문 상품 번호: " + productNumber);
        System.out.println("배송 주소: " + shippingAddress);
    }
}