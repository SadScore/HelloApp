package Module1;

public class JavaIfSwitchReturn {
    /**
     * Даны два числа x и y.
     * Программа должна вывести в консоль «Удачное совпадение», – если оба числа четные, либо оба числа нечетные.
     * Иначе программа ничего не выводит.
     */
    public static void main(String[] args) {
        int x = 13, y = 15;
        if ((x % 2 == 0) && (y % 2 == 0)) {
            System.out.println("Удачное совпадение!!!");
        } else if ((x % 2 == 1) && (y % 2 == 1)) {
            System.out.println("Удачное совпадение!!!");
        } else {
            System.out.println("");
        }
    }
}
