package LambdaHomeTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Напишите программу, реализующую лямбда-выражение для определения самого длинного слова в списке, состоящего из нескольких слов.
 */
public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Зеленый", "Голубой", "Черный", "Нитритовый","Серобурмалиновый"));
        Operation max = (List) -> {
            String maxS = " ";
            for (int i = 0; i < words.size(); i++) {
                for (int j = 0; j < words.size(); j++){
                    if (words.get(i).length() < words.get(j).length()){
                        maxS = words.get(j);
                    }
                }
            }
            return maxS;
        };
        System.out.println("Самое длинное слово в списке:");
        System.out.println(max.isMaxLong(words));
    }
}
interface Operation{
    String isMaxLong(List<String> list);
}
