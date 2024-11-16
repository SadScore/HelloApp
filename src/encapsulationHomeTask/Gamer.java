package encapsulationHomeTask;

/**
 * Создать класс Gamer с полем private строкового типа nickname и полем private логического типа isActive,
 * оно характеризует в игре сейчас объект класса или нет, т.е. true или false соответственно.
 * Создать конструктор этого класса и методы доступа к полям класса.
 */
public class Gamer {
    private String nickname;
    private boolean isActive;

    public Gamer(boolean isActive, String nickname) {
        this.isActive = isActive;
        this.nickname = nickname;
    }


    public String getNickname() {
        return nickname;
    }

    public boolean isActive() {

        return isActive;
    }

    @Override
    public String toString() {
        return "Игрок " +
                "с ником " + nickname +
                "\nВ сети: " + isActive;
    }
}
