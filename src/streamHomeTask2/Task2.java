package streamHomeTask2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    /**
     * Напишите программу для удаления всех повторяющихся элементов из списка с помощью потоков.
     */
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("Match", "совпадение", "что2", "важно1",
                "Collect", "собрать", "что2", "важно1",
                "Stream", "поток", "что2", "бежит"));
        List<String> result = strings.stream().distinct().collect(Collectors.toList());
        System.out.println(strings);
        System.out.println(result);

    }
}

