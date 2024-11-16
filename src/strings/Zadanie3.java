package strings;

public class Zadanie3 {
    /**
     * Дана некоторая строка - "1203405".
     * Найдите позицию первого нуля в строке.
     * Т.е. позиция первого нуля в этой строке равна 2.
     */
    public static void main(String[] args) {
        String stroke = "1203405";
        System.out.println("Позиция первого нуля: " + stroke.indexOf('0'));
    }
}
