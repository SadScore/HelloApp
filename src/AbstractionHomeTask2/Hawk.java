package AbstractionHomeTask2;

public class Hawk extends Bird{
    String birdName;
    public Hawk(double flySpeed, String birdName) {
        super(flySpeed);
        this.birdName = birdName;
    }

    @Override
    public void fly() {
        System.out.println(birdName + "летит со скоростью: " + flySpeed + " км/ч");

    }

    @Override
    public void makeSound() {
        System.out.println(birdName + " КРИЧИТ!!!");
    }
}
