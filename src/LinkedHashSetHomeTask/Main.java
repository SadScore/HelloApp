package LinkedHashSetHomeTask;
import java.util.TreeSet;

public class Main {
    /**
     * Создайте два набора, хранящих в себе элементы строкового типа, характеризующие цвет чего – либо.
     * Напишите метод для сравнения двух наборов и сохранения элементов, которые одинаковы для обоих наборов.
     */
    public static void main(String[] args) {
        TreeSet<String> color3 = new TreeSet<>();
        color3.add("Синий");
        color3.add("Розовый");
        color3.add("Белый");
        color3.add("Черный");
        color3.add("Красный");
        color3.add("Голубой");

        TreeSet<String> color4 = new TreeSet<>();
        color4.add("Фиолетовый");
        color4.add("Розовый");
        color4.add("Белый");
        color4.add("Желтый");
        color4.add("Красный");
        color4.add("Зеленый");
        Colors<String> colors = new Colors<>();
        colors.compareTwo(color3, color4);





    }

}
