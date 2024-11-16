package Module1;

public class JavaIfSwitchReturn2 {
    /**
     * В переменной day лежит какое-то число из интервала от 1 до 31.
     * Определите в какую декаду месяца попадает это число (в первую, вторую или третью).
     */
    public static void main(String[] args) {
        int day = 17;
        if (day > 0 && day <= 10) {
            System.out.println("Первая декада месяца!");
        } else if (day >= 11 && day <= 20) {
            System.out.println("Вторая декада месяца!");
        } else if (day >= 21 && day <= 31) {
            System.out.println("Третья декада месяца!");

        } else {
            System.out.println("Столько дней в месяце нет!");
        }

    }
}
