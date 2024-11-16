package InterfacesHomeTask;

public class Human implements Swimmable, Flyable {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println(name + " плывет топориком в возрасте " + age + " лет!");
    }

    @Override
    public void fly() {
        System.out.println("Летит на воздушном шаре!");
    }
}
