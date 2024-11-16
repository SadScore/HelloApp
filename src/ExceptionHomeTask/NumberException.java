package ExceptionHomeTask;
public class NumberException {
    /**
     * ***Напишите метод, который принимает строку в качестве входных данных и выдает исключение, если строка содержит числа.
     */

    public void isNumberHere(String number) throws Exception {

        char[] chars = number.toCharArray();
        char[] num = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (chars[i] == num[j]) {
                    throw new Exception("Строка содержит число!");
                }
            }
        }
        System.out.println("Строка не содержит чисел!");
    }
}