package exercise.q06;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2300, 2, 29); // 평년
        MyDate date2 = new MyDate(2400, 2, 29);
        if (date1.isValid()) {
            System.out.println("date1: 유효한 날짜입니다.");
        } else {
            System.out.println("date1: 유효하지 않은 날짜입니다.");
        }
        if (date2.isValid()) {
            System.out.println("date2: 유효한 날짜입니다.");
        } else {
            System.out.println("date2: 유효하지 않은 날짜입니다.");
        }
    }
}
