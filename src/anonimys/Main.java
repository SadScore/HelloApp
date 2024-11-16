package anonimys;

public class Main {
    public static void main(String[] args) {
        System.out.println(processTwoNumbers(4, 8, (a, b) -> a * b));

    }

    public static int processTwoNumbers(int a, int b, Actionable<Integer, Integer> actionable) {
        return actionable.action(a, b);
    }

}

@FunctionalInterface
interface Actionable<T, V> {
    int action(T t, V v);


}
