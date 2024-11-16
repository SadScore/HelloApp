package AbstractionHomeTask2;

public class Main {
    public static void main(String[] args) {
        Bird hawk = new Hawk(67, "Сокол");
        hawk.fly();
        hawk.makeSound();
        System.out.println("---------------------------");
        Eagle eagle = new Eagle(101, "Орел", 16);
        eagle.fly();
        eagle.makeSound();
    }
}
