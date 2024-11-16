package genericHomeTask;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String[] strings1 = {"Во", "глубине", "сибирских", "руд"}; //Во глубине сибирских руд
        String[] strings2 = {"Храните", "гордое", "терпенье", ","}; //Храните гордое терпенье,

        String[] strings3 = {"Не", "пропадет", "ваш", "скорбный", "труд"}; // Не пропадет ваш скорбный труд
        String[] strings4 = {"Не", "пропадет", "ваш", "скорбный", "труд"};

        Integer[] intArray1 = {111,444,555,777};
        Integer[] intArray2 = {2, 12, 513, 33};
        Integer[] intLostArray1 = {4, 8, 15, 16, 23, 42};
        Integer[] intLostArray2 = {4, 8, 15, 16, 23, 42};

        GenericArrays<String> stringGenericArray = new GenericArrays<>(strings1, strings2);
        GenericArrays<Integer> integerGenericArray= new GenericArrays<>(intArray1, intArray2);

        System.out.println(GenericArrays.compare(strings1, strings2));
        System.out.println("------");
        System.out.println(GenericArrays.compare(strings3, strings4));
        System.out.println("------");
        System.out.println(GenericArrays.compare(intArray1, intArray2));
        System.out.println("------");
        System.out.println(GenericArrays.compare(intLostArray1, intLostArray2));
        System.out.println("----------------------------");
        System.out.println("Оригинал:");
        System.out.println(Arrays.toString(strings1));
        System.out.println(Arrays.toString(strings2));
        System.out.println("----------------------------");

        System.out.println("Заменим ЧЕТВЕРТЫЙ элемент (индекс 3)");
        GenericArrays.switchEntryAtIndex(strings1, strings2, 3);

        System.out.println(Arrays.toString(strings1));
        System.out.println(Arrays.toString(strings2));
        System.out.println("Оригинал:");
        System.out.println(Arrays.toString(intArray1));
        System.out.println(Arrays.toString(intArray2));
        System.out.println("----------------------------");
        System.out.println("Заменим ТРЕТИЙ элемент (индекс 2)");
        GenericArrays.switchEntryAtIndex(intArray1, intArray2, 2);

        System.out.println(Arrays.toString(intArray1));
        System.out.println(Arrays.toString(intArray2));
    }

}
