package Exception;

public class Main2 {
    /**
     * throw
     */
    public static void main(String[] args) {
        int value = 20;
        int result = 0;
        int n = 0;
        if (n == 0) {
            throw new ArithmeticException("Ошибка!!! на ноль делить нельзя!");
        }
        result = value/ n;
        System.out.println(result);
    }
}
