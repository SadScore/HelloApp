package AbstractionHomeTask;

public class Guitar extends Instrument {
    public Guitar(int numberOfString, String nameOfInstrument) {
        super(numberOfString, nameOfInstrument);
    }

    @Override
    public void play() {
        System.out.println("Гитара: " + nameOfInstrument + " играет!");

    }

    @Override
    public void tune() {
        System.out.println("Все " + numberOfString + " струн на гитаре " + nameOfInstrument +  " настроены!");

    }
}
