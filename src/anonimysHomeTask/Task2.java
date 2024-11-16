package anonimysHomeTask;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Написать функциональный интерфейс Concationble с методом concat(), который объединяет две строковых переменных,
 * передаваемых в параметры метода и возвращает строку.
 * В классе с методом main создать несколько анонимных классов с различными реализациями метода concat().
 */
public class Task2 {
    public static void main(String[] args) {
        Concationble c1 = new Concationble() {
            @Override
            public String concat(String one, String two) {
                return one + two;
            }
        };
        Concationble c2 = new Concationble() {
            @Override
            public String concat(String one, String two) {
                String con2 = one + two;

                return "Результат сложение строк: " + con2 + "\nДлина результата сложения: " + con2.length();
            }
        };
        Concationble c3 = new Concationble() {
            @Override
            public String concat(String one, String two) {
                String con3 = one + two;
                return "Сложение строк результат: " + con3 + "\nБуква 'В' встречаеться на позиции " + con3.indexOf("В");
            }
        };
        System.out.println(c1.concat("Привет! ", "Как дела?"));
        System.out.println("------------------------");
        System.out.println(c2.concat("Нормально! ", "Как твои дела?"));
        System.out.println("------------------------");
        System.out.println(c3.concat("Нереально! ", "Всё хорошо!"));
    }
}
@FunctionalInterface
interface Concationble {
    String concat(String one, String two);
}
