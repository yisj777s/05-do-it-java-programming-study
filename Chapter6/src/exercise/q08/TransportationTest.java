package exercise.q08;

public class TransportationTest {
    public static void main(String[] args) {
        Student studentEdward = new Student("Edward", 50000);
        Taxi kakaoTaxi = new Taxi("카카오");

        studentEdward.takeTaxi(kakaoTaxi, 10000);

        studentEdward.showInfo();
        kakaoTaxi.showInfo();
    }
}
