package AbstractionHomeTask2;

public class Eagle extends Bird {
    String birdName;
    int weight;
    public Eagle(double flySpeed, String birdName, int weight) {
        super(flySpeed);
        this.birdName = birdName;
        this.weight = weight;

    }

    @Override
    public void fly() {
        System.out.println(birdName + " весом " + weight + " кг, летит со скоростью: " + flySpeed + " км/ч");


    }

    @Override
    public void makeSound() {
        System.out.println(birdName + " ОРЕТ!");

    }
}
