package inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lada", 1335);
        car.drive();
        car.stop();
        Aircraft aircraft = new Aircraft("Cesna", 2507);
        aircraft.drive();
        aircraft.stop();


    }
}
