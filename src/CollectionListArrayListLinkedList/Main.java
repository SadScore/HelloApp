package CollectionListArrayListLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * 1) Создайте ArrayList, содержащий разные цвета, тип элемента этого динамического массива – String.
 * Напишите метод для поиска элемента в списке , содержащем эти цвета. На вход метод принимает параметр поиска.
 * Например,если список содержит «red», «blue», «green»
 * и в аргументы метода передать «red», то метод должен вернуть true, символизируя то, что этот цвет содержится в списке.
 * 2) Создайте LinkedList, содержащий целые числа, т.е. Integer. Напишите метод, который меняет местами первый
 * и последний элементы этого списка и возвращает этот список в новом виде. Т.е., если создали список [1, 2, 3, 4, 5],
 * то в результате должны получить [5, 2, 3, 4, 1].
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("красный");
        colors.add("голубой");
        colors.add("белый");

        System.out.println(isObjectHere("красный", colors));
        System.out.println(isObjectHere("голубой", colors));
        System.out.println(isObjectHere("белый", colors));
        System.out.println(isObjectHere("зеленый", colors));

        Integer[] lostArray = {4, 8, 15, 16, 23, 42};
        LinkedList<Integer> numbers = new LinkedList<>();
        for (Integer i : lostArray) {
            numbers.add(i);
        }
        System.out.println(numbers);
        System.out.println(changeFirstAndLastElements(numbers));

    }

    public static<T> boolean isObjectHere(T object, List list) {
        if (list.indexOf(object) > -1) {

            return true;
        }
        return false;
    }


    public static<T> LinkedList<T> changeFirstAndLastElements(LinkedList<T> linkedList) {
        T firstElement = linkedList.pop();
        T lastElement = linkedList.peekLast();
        linkedList.removeLast();
        linkedList.addFirst(lastElement);
        linkedList.addLast(firstElement);
        return linkedList;
    }

}