package exercise.q03;

public class EvenArray {
    public static void main(String[] args) {
        int[] evenArray = new int[5];
        int sum = 0;

        for (int i = 0, even = 2; i < evenArray.length; i++, even += 2) {
            evenArray[i] = even;
        }

        for (int i = 0; i < evenArray.length; i++) {
            sum += evenArray[i];
        }

        System.out.println("evenArray 배열 요소의 합은 " + sum + "입니다.");
    }
}
