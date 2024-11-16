package LinkedHashSetHomeTask;

import java.util.TreeSet;

/**
 * Создайте множество целых чисел. Необходимо вывести в консоль все его элементы,
 * которые больше 15 и являются четными.
 * Остальные элементы набора тоже необходимо вывести в консоль, но каждый из них разделив на 2.
 */
public class MyNumbers<T> {

    public void findMyNumbers(TreeSet<Integer> myNumberTree) {
        T[] myNumberArray = (T[]) myNumberTree.toArray();
        TreeSet<Integer> myNewNumSet = new TreeSet<>();
        TreeSet<Integer> myNewNumSet2 = new TreeSet<>();


        for (int i = 0; i < myNumberArray.length; i++) {
            if ((Integer) myNumberArray[i] > 15 && (Integer) myNumberArray[i] % 2 == 0) {
                myNewNumSet.add((Integer) myNumberArray[i]);
            }
            if (((Integer) myNumberArray[i] <= 15)) {
                myNewNumSet2.add((Integer) myNumberArray[i] / 2);
            }

        }
        System.out.println("Числа больше 15 и четные:");
        System.out.println(myNewNumSet);
        System.out.println("Остальные деленные на два:");
        System.out.println(myNewNumSet2);


    }


}
