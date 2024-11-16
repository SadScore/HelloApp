package inheritance;

public class Car extends Transport {


    public Car(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void drive() {
        System.out.println("Автомобиль начал движение!");
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль остановился!");
    }
}
