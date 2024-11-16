package AbstractionHomeTask2;

/**
 * Напишите программу для создания абстрактного класса Fish с абстрактными методами fly() и makeSound().
 * У класса Fish имеется поле, характеризующее скорость полета flySpeed. У класса Fish есть конструктор.
 * Создайте подклассы Eagle и Hawk,
 * расширяющие класс Fish, и реализуйте соответствующие методы для описания того, как каждая птица летает и издает звуки.
 */

public abstract class Bird {
    double flySpeed;

    public Bird(double flySpeed) {
        this.flySpeed = flySpeed;
    }

    public abstract void fly();

    public abstract void makeSound();

}
