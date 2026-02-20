package practice;

/**
 * 반복문과 조건문을 사용하여 별로 마름모 모양을 출력하는 프로그램
 */
public class Q05 {
    public static void main(String[] args) {
        int n = 7; // 전체 줄 수 (홀수)
        int mid = n / 2; // 가운데 줄 인덱스
        int last = n - 1; // 마지막 줄 인덱스

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= mid) {
                    if (j >= mid - i && j <= mid + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j >= i - mid && j <= mid + (last - i)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}
