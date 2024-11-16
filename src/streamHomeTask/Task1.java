package streamHomeTask;

import java.util.Arrays;
import java.util.List;

/**
 * Создайте список типа String, например, названия пищевых продуктов.
 * Напишите программу для подсчета количества строк в списке, начинающихся с определенной буквы, с использованием потоков.
 */
public class Task1 {
    public static void main(String[] args) {
        List<String> games = Arrays.asList("Assassin`s creed", "Battlefield", "CS:go2", "Spider",
                "Sniper elit", "TAXI", "Call of Duty", "Final Fantasy", "Witcher 3", "Winx", "Animal Crossing");
        String prefix = "A";
        int count = (int) games.stream()
                .filter(s -> s.toLowerCase().startsWith(prefix.toLowerCase()))
                .count();
        System.out.println(count);
    }
}
