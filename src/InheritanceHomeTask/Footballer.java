package InheritanceHomeTask;

public class Footballer extends Sportsman {

    public Footballer(String name, int age, String team) {
        super(name, age, team);
    }

    @Override
    public void getInjured() {
        System.out.println("Футболист " + getName() + " порвал крестообразную связку!");
    }

    public void getRetire() {
        System.out.println("Футболист из команды " + getTeam() + " вышел на пенсию в " + getAge() + " лет!");
    }
}
