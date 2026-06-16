package gr.aueb.cf.ch17.lifo_parking;

public class Main {

    public static void main(String[] args) {
        LifoParking lifoParking = new LifoParking();

        lifoParking.addCar("IAE 2323");
        lifoParking.addCar("ZAO 1391");
        lifoParking.addCar("XD 3444");

        String car = lifoParking.removeCar();
//        System.out.println(car);

        car = lifoParking.removeCar();
//        System.out.println(car);

        lifoParking.traverse();
    }
}
