package Lesson1;

public class VariablesDataTypesOperators {

    public static void main(String[] args) {
        /**
         * Создать переменные следующих типов: int, double, char с произвольными значениями.
         * Создать переменную result типа double, которая будет содержать сумму вышеуказанных переменных.
         * Вывести в консоль переменную result.
         */

        int a1 = 7;
        double b2 = 6.7;
        char c = 'S'; // ((int)c) = 83

        double result  = a1 + b2 + c;
        System.out.println("Значения перемееной (c) типа данных char 'S' = " + (int)c);
        System.out.println("Результат сложения = " + result);





    }
}
