package practice;

/**
 * switch-case문으로 층에 따른 장소 안내하기
 */
public class Q10 {
    public static void main(String[] args) {
        int floor = 5;

        String place = switch (floor) {
            case 1 -> floor + "층 약국입니다.";
            case 2 -> floor + "층 정형외과입니다.";
            case 3 -> floor + "층 피부과입니다.";
            case 4 -> floor + "층 치과입니다.";
            case 5 -> floor + "층 헬스 클럽입니다.";
            default -> floor + "층은 없는 층입니다.";
        };

        System.out.println(place);
    }
}
