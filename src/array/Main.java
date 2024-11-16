package array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
         * Поиск макс или мин сортировка (пузырьком)
         */
        int[] array = {2, 25, 6, 14};
        System.out.println("Сортировка массива по возрастанию ");
        System.out.println(Arrays.toString(sortArray(array)));
//        System.out.print("Проверка на существование элемента в массиве: ");
//        System.out.println(search(15, array));
//        System.out.println("Максимальное значение числа: " + getMax(array));
    }
    private static int[] sortArray(int [] array){
        for (int i = array.length; i > 0; i--){
            for (int j = array.length; j > 1; j--){
                if (array[j-1]<array[j]){
                    int temp = array[j];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

//    private static boolean search (int element, int[] array){
//        for (int i = 0; i < array.length; i++){
//            if (element == array[i]){
//                return true;
//            }
//        }
//        return false;
//    }

//    private static int getMax(int[] array) {
//        int max = array[0];
//        for (int i = 0; i < array.length - 1; i++) {
//            if (max < array[i + 1]) {
//                max = array[i + 1];
//
//            }
//        }
//        return max;
//    }
    }

