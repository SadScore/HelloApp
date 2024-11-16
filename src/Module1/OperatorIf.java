package Module1;

public class OperatorIf {
    public static void main(String[] args) {
        int a = -5; // а больше нуля? Если - да "Положительное число" ИНАЧЕ (:) "Отрицательное число"
        String result = a > 0 ? "Положительное число" : "Отрицательное число";
        System.out.println(result);
    }
}
