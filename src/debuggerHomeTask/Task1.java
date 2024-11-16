package debuggerHomeTask;

import java.util.Arrays;

public class Task1 {
    /**
     * Дан массив целых чисел. Найти максимальное число из четных в этом массиве.
     */
    public static void main(String[] args) {
        int[] array = new int[21];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Наш массив случайных чисел = " + Arrays.toString(array));
        int maxMyNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxMyNumber && array[i] % 2 == 0) {
                maxMyNumber = array[i];
            }
        }

        System.out.println("Максимальное ЧЕТНОЕ число в массиве " + maxMyNumber);
        System.out.println("------------------- \nИЛИ");
        int[] array2 = new int[21];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 100);
        }
        System.out.println("Наш массив случайных чисел = " + Arrays.toString(array2));
        int maxMyNumber2 = Arrays.stream(array2).filter((i) -> i % 2 == 0).max().getAsInt();
        System.out.println("Максимальное ЧЕТНОЕ число в массиве " + maxMyNumber2);

    }
}
