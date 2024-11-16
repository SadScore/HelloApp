package InheritanceHomeTask;

public class Sportsman {
    private String name;
    private String team;
    private int age;

    public Sportsman(String name, int age, String team) {
        this.name = name;
        this.age = age;
        this.team = team;
    }

    public void getInjured(){
        System.out.println("Спортсмен травмирован =( ");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTeam() {
        return team;
    }
}
