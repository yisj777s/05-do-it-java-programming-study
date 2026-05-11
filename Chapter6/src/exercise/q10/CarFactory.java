package exercise.q10;

public class CarFactory {
    private static CarFactory instance = new CarFactory();
    private static int serialNumber = 10000;

    private CarFactory() {}

    public static CarFactory getInstance() {
        return instance;
    }

    public Car createCar() {
        serialNumber++;
        return new Car(serialNumber);
    }
}
