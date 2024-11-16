package Module1;

public class WhileDoWhileForBreakContinue {
    /**
     * Вывести в консоль значения диапазона чисел от 1 до 50 кратные 3 с использованием цикла while.
     */
    public static void main(String[] args) {
        int a = 1;
        int b = 50;
        while (a < b) {
            if (a % 3 == 0) {
                System.out.print(" " + a);
            }
            a++;

        }
    }
}
