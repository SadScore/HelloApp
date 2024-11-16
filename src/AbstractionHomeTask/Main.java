package AbstractionHomeTask;

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(6, "Washborn");
        guitar.play();
        guitar.tune();
        System.out.println("---------------------");
        Instrument piano = new Piano(230, "Yamaha", 246);
        piano.play();
        piano.tune();

    }
}
