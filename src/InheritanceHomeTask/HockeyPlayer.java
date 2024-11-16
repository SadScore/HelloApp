package InheritanceHomeTask;

public class HockeyPlayer extends Sportsman {
    public HockeyPlayer(String name, int age, String team) {
        super(name, age, team);
    }

    @Override
    public void getInjured() {
        System.out.println("Хоккеист " + getName() + " " + getAge() + " год, потерял зуб!");
    }

    public void fight(){
        System.out.println("Хокеис из команды "  + getTeam() + " Вступил в бой с соперником на льду!");
    }
}
