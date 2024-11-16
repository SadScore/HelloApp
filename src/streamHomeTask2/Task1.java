package streamHomeTask2;
import java.util.*;
public class Task1 {
    /**
     * Напишите программу для вычисления суммы всех четных и нечетных чисел в списке с использованием потоков.
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 7, 4, 0, 9, 22, 21, 8, 17, 5));
        System.out.println(getSumOfEven(numbers));
        System.out.println(getSumOfOdd(numbers));
    }
    public static int getSumOfEven(List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 == 0).reduce((a, b) -> a + b).get();
    }
    public static int getSumOfOdd(List<Integer> numbers) {

        return numbers.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();
    }
}
