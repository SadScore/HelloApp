package strings;

public class Zadanie2 {
    /**
     * Дана строка: String stroke = "12345".
     * Выведите в консоль значение, которое можно, взяв первый и последний символ этой строки в следующем виде.
     * Т.е. "15".
     */
    public static void main(String[] args) {
        String stroke = "12345";
        System.out.println(stroke.substring(0,1)+ stroke.substring((stroke.length()-1),stroke.length()));
    }
}
