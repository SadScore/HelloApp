package LinkedHashSetHomeTask;

import java.util.TreeSet;

/**
 * Создайте множество целых чисел. Необходимо вывести в консоль все его элементы,
 * которые больше 15 и являются четными.
 * Остальные элементы набора тоже необходимо вывести в консоль, но каждый из них разделив на 2.
 */
public class Main2 {
    public static void main(String[] args) {
        TreeSet<Integer> myNumbers1 = new TreeSet<>();
        myNumbers1.add(122);
        myNumbers1.add(764);
        myNumbers1.add(10);
        myNumbers1.add(7);
        myNumbers1.add(84);
        myNumbers1.add(9);
        myNumbers1.add(15);// Не выведиться т.к. уже есть 7 (14/2)
        myNumbers1.add(14);//
        System.out.println(myNumbers1);
        MyNumbers<Integer> myNumbers = new MyNumbers<>();
        myNumbers.findMyNumbers(myNumbers1);

    }
}
