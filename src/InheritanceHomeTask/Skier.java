package InheritanceHomeTask;

public class Skier extends Sportsman {

    public Skier(String name, int age, String team) {
        super(name, age, team);
    }

    @Override
    public void getInjured() {
        System.out.println("Лыжник сломан ногу! Ему (Ей) всего " + getAge() + " лет/ год!");;
    }

    public void lostStick(){
        System.out.println("Спортсмен(ка) " + getName() + " из команды " + getTeam() + " потерял(а) палку!");
    }
}
