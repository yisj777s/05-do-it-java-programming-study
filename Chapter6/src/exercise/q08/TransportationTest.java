package exercise.q08;

public class TransportationTest {
    public static void main(String[] args) {
        Student studentEdward = new Student("Edward", 20000);
        Taxi kakaoTaxi = new Taxi("카카오", 10000);
        Taxi uberTaxi = new Taxi("우버", 8000);

        studentEdward.showInfo();
        kakaoTaxi.showInfo();
        uberTaxi.showInfo();

        studentEdward.takeTaxi(kakaoTaxi);
        studentEdward.takeTaxi(uberTaxi);

        kakaoTaxi.showInfo();
        uberTaxi.showInfo();
        studentEdward.showInfo();

        studentEdward.takeTaxi(uberTaxi);
        studentEdward.takeTaxi(kakaoTaxi);
    }
}
