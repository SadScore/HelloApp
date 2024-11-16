package Exception;

public class Main {
    // Try и catch
    public static void main(String[] args) {
        int value = 10;

        try {
            int result = value /0;
            System.out.println("Эта фраза не будет выведена");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка! деление на ноль!");
        }
        System.out.println("После оператора catch!");

    }
}
