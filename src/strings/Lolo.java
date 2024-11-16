package strings;

import java.util.Arrays;

public class Lolo {
    public static void main(String[] args) {
        String[] stringArray = {"ab", "cd", "ef"};
        int length = 0;
        for (String s : stringArray) {
            length += s.length();
        }

        char[] charArray = new char[length];
        int count = 0;
        for (String s : stringArray) {
            for(int i = 0; i < s.length(); i++)
            {
                charArray[count] = s.charAt(i);
                count++;
            }
        }
        System.out.println(Arrays.toString(charArray) + '\n');
    }
}
