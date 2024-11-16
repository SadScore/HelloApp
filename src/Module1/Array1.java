package Module1;


public class Array1 {
    /**
     * Дан массив целых чисел int[] array = {3, 87, 12, 98, 2, 4, 66}.
     * Вывести в консоль элементы массива в обратном порядке, т.е. начиная с 66
     */
    public static void main(String[] args) {
        int[] array = {3, 87, 12, 98, 2, 4, 66};
        System.out.print("Массив {3, 87, 12, 98, 2, 4, 66} в обратном порядке: ");
        for (int i = array.length-1; i > 0; i--){
            System.out.print(" " + array[i]);
        }

    }
}
