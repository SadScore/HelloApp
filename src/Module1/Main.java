package Module1;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 7);
        System.out.println("Сумма ровна " + calculator.sum(7,16));
        System.out.println("Разность ровна " + calculator.subtract(8,4));
        calculator.multiplication();
        calculator.division();
    }
}
