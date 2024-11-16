package Module1;
import java.util.Arrays;
public class Array2 {

    /**
     * Дан произвольный массив чисел с плавающей точкой.
     * Необходимо отсортировать его по убыванию.
     */
    public static void main(String[] args) {
        double[] array = {3.2, 4.2, 3.3, 5.2, 1.9, 0.0};
        System.out.println(Arrays.toString(sortArray(array)));
    }

    private static double[] sortArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
}
