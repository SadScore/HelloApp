package LinkedHashSetHomeTask;
/**
 * Создайте два набора, хранящих в себе элементы строкового типа, характеризующие цвет чего – либо.
 * Напишите метод для сравнения двух наборов и сохранения элементов, которые одинаковы для обоих наборов.
 */
import java.util.TreeSet;

public class Colors<T> {

    public <T> void compareTwo(TreeSet<T> color1, TreeSet<T> color2) {
        Object[] color1Array = color1.toArray();
        Object[] color2Array = color2.toArray();
        TreeSet<T> myCollection = new TreeSet<>();
        for (int i = 0; i < color1Array.length; i++) {
            for (int j = 0; j < color2Array.length; j++) {
                if (color1Array[i].equals(color2Array[j])){
                    String s = color1Array[i].toString();
                    myCollection.add((T) s);
                    System.out.println("В набор добавлен " + s);
                }
            }
        }
        System.out.println(myCollection);
    }

}


