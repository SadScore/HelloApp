package CollectionListHomeTask;
import java.util.LinkedList;
/**
 * 2) Создайте LinkedList, содержащий целые числа, т.е. Integer. Напишите метод, который меняет местами первый
 * и последний элементы этого списка и возвращает этот список в новом виде. Т.е., если создали список [1, 2, 3, 4, 5],
 * то в результате должны получить [5, 2, 3, 4, 1].
 */
public class Task2 {
    public static void main(String[] args) {
        Integer[] lostArray = {4, 8, 15, 16, 23, 42};
        LinkedList<Integer> numbers = new LinkedList<>();
        for (Integer i : lostArray) {
            numbers.add(i);
        }
        System.out.println(numbers);
        System.out.println(changeFirstAndLastElements(numbers));
    }
    public static <T> LinkedList<T> changeFirstAndLastElements(LinkedList<T> linkedList) {
        T firstElement = linkedList.pop();
        T lastElement = linkedList.peekLast();
        linkedList.removeLast();
        linkedList.addFirst(lastElement);
        linkedList.addLast(firstElement);
        return linkedList;
    }

}
