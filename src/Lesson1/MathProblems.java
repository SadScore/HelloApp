package Lesson1;

public class MathProblems {
    /**
     * Дана переменная a = 6.
     * Необходимо выполнить последовательность операций с переменной a.
     * Сначала прибавить к ней 6, затем вычесть 2, разделить на 5, умножить на 7.
     */
    public static void main(String[] args) {
        int a = 6;

        a+=6; // 6 + 6 = 12
        a-=2; // 12 - 2 = 10
        a/=5; // 10 / 5 = 2
        a*=7; // 2 * 7 = 14
        System.out.println(a);
    }
}
