package LambdaHomeTask;

/**
 * Напишите программу, реализующую лямбда-выражение для вычисления суммы всех четных элементов списка
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = {4, 8, 15, 16, 23, 42};
        Operators sum = ExpressionHelper::isEven;
        System.out.println(sumOfEven(array, sum));
    }
    public static int sumOfEven(int[] array, Operators oper) {
        int result = 0;
        for (int elemeny : array) {
            if (oper.isEqual(elemeny)) {
                result += elemeny;
            }
        }
        return result;
    }
}

class ExpressionHelper {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
interface Operators {
    boolean isEqual(int a);
}