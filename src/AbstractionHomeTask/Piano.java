package AbstractionHomeTask;

public class Piano extends Instrument{
    int weight;

    public Piano(int numberOfString, String nameOfInstrument, int weight) {
        super(numberOfString, nameOfInstrument);
        this.weight = weight;
    }

    @Override
    public void play() {
        System.out.println("Пианино: " + nameOfInstrument + " весом " + weight + " кг. играет!");


    }

    @Override
    public void tune() {
        System.out.println("Все " + numberOfString + " на пианино " + nameOfInstrument +  " настроены!");

    }
}
