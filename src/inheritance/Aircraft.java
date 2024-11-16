package inheritance;

public class Aircraft extends Transport {

    public Aircraft(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void drive() {
        System.out.println("Воздушное судно взлетело!");
    }

    @Override
    public void stop() {
        System.out.println("Воздушное судно приземлилось!");
    }
}
