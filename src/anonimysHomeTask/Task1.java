package anonimysHomeTask;

public class Task1 {
    /**
     * Написать функциональный интерфейс Printable с методом print().
     * В классе с методом main создать несколько анонимных классов с различными реализациями метода print().
     */
    public static void main(String[] args) {
        Printable one = new Printable() {
            @Override
            public void print() {
                System.out.println("Дорогой мой друг!");
            }
        };
        Printable two = new Printable() {
            @Override
            public void print() {
                System.out.println("Дорогие мои два друга!");
            }
        };
        Printable three = new Printable() {
            @Override
            public void print() {
                System.out.println("Дорогие мои три друга!");
            }
        };
        one.print();
        two.print();
        three.print();
    }
}
@FunctionalInterface
interface Printable {
    void print();
}
