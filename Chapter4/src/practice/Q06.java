package practice;

/**
 * gender 값에 따라 성별 메시지를 출력하는 프로그램
 */
public class Q06 {
    public static void main(String[] args) {
        char gender = 'M';
        if (gender == 'F') {
            System.out.println("여성입니다.");
        } else if (gender == 'M') {
            System.out.println("남성입니다.");
        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }
}
