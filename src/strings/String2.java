package strings;

import java.lang.String;
import java.util.Arrays;

public class String2 {
    /**
     * Дан массив со строками: String[] stringArray = {"ab", "cd", "ef"}.
     * Получите массив символов этих строк: char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'}
     */

    public static void main(String[] args) {
        String[] stringArray = {"ab", "cd", "ef"};
        String newString = Arrays.stream(stringArray).reduce((a, b) -> a + b).get();
        char[] charArray = newString.toCharArray();
        System.out.println("Массив символов " + Arrays.toString(charArray));

    }
}



