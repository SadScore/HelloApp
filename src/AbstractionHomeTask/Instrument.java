package AbstractionHomeTask;

/**
 * Напишите программу для создания абстрактного класса Instrument с абстрактными методами play() и tune().
 * Создайте подклассы для Guitar и Piano,
 * которые расширяют класс Instrument и реализуют соответствующие методы для игры и настройки каждого инструмента.
 */
public abstract class Instrument {
    int numberOfString; // Кол-во струн в инструменте
    String nameOfInstrument;

    public Instrument(int numberOfString, String nameOfInstrument) {
        this.numberOfString = numberOfString;
        this.nameOfInstrument = nameOfInstrument;
    }

    public abstract void play();

    public abstract void  tune();


}
