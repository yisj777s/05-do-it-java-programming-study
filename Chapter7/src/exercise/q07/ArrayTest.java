package exercise.q07;

public class ArrayTest {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int n : num) {
            sum += n;
        }

        System.out.println("num 배열 요소의 합: " + sum);
    }
}