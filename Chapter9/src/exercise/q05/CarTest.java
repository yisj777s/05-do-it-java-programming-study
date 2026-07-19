package exercise.q05;

import java.util.List;
import java.util.ArrayList;


public class CarTest {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Sonata());
        carList.add(new Grandeur());
        carList.add(new Avante());
        carList.add(new Genesis());
        for (Car car : carList) {
            car.run();
            System.out.println("====================");
        }
    }
}
