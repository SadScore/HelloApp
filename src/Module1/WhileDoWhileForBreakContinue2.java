package Module1;

public class WhileDoWhileForBreakContinue2 {

    /**
     * Напишите программу, которая находит сумму всех чисел от 1 до 100 с использованием цикла for
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Сумма всех чисел от 1 до 100 = " + sum);
    }
}
