package InheritanceHomeTask;

public class Main {
    public static void main(String[] args) {
        Skier skier1 = new Skier("Павел", 21, "Волки");
        skier1.getInjured();
        skier1.lostStick();
        System.out.println(" ");
        Skier skier2 = new Skier("Елена", 32, "Роза Ветров");
        skier2.getInjured();
        skier2.lostStick();
        System.out.println("---------------------------------------");

        Footballer footballer1 = new Footballer("Пабло", 19, "Торпедо");
        footballer1.getInjured();
        footballer1.getRetire();
        System.out.println(" ");
        Footballer footballer2 = new Footballer("Алексей", 28, "Регион");
        footballer2.getInjured();
        footballer2.getRetire();
        System.out.println("---------------------------------------");

        HockeyPlayer hockeyPlayer1 = new HockeyPlayer("Рафаэль", 31, "Сибирские молоты");
        hockeyPlayer1.fight();
        hockeyPlayer1.getInjured();
        System.out.println(" ");
        HockeyPlayer hockeyPlayer2 = new HockeyPlayer("Дмитрий", 27, "Яростные клюшки");
        hockeyPlayer2.fight();
        hockeyPlayer2.getInjured();
    }
}
