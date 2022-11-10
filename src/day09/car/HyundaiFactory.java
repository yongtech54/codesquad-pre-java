package day09.car;

public class HyundaiFactory {
    private static int serialNumber = 1000;
    private static HyundaiFactory factory = new HyundaiFactory();

    private HyundaiFactory() {}

    public static HyundaiFactory getFactory() {
        return factory;
    }

    public Car createCar() {
        Car aCar = new Car(serialNumber);
        serialNumber++;
       return  aCar;
    }

}
