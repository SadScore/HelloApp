package encapsulationHomeTask;

public class Main {
    public static void main(String[] args) {

        Gamer[] gamers = {new Gamer(true, "Ponchik"),
                new Gamer(false, "Folpu4ar"),
                new Gamer(true, "Pon1ope"),
                new Gamer(false, "Time2b"),
                new Gamer(true, "Marina")};
        for (int i = 0; i < gamers.length; i++) {
            if (gamers[i].isActive() == true) {
                System.out.println(gamers[i]);
            }
        }
        Gamer gamer = new Gamer(true, "Stas!k");
        gamer.isActive();
        System.out.println(gamer);











    }
}
