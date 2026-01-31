package operator.practice;

public class Q10 {
    public static void main(String[] args) {
        int num = 5;
        int i = 10;

        boolean value = ((num = num * 10) > 45) || ((i = i - 5) < 10);
        System.out.println(value); // true
        System.out.println(num); // 50
        System.out.println(i); // 10
    }
}
