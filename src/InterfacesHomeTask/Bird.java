package InterfacesHomeTask;

public class Bird extends Human implements Swimmable, Flyable {
    String name;
    int age;

    public Bird(String name, int age) {
        super(name, age);
    }


    @Override
    public void swim() {
        System.out.println(name + " плывёт по воде гребя лапками в возрасте " + age + " лет!");

    }

    @Override
    public void fly() {
        System.out.println("Летит махая (маша) крыльями!");
    }
}
