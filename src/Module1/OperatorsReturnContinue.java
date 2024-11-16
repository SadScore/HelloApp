package Module1;

public class OperatorsReturnContinue {
    public static void main(String[] args) {
        int a = 5;
        if (a == 5){
            System.out.println("Сейчас программа завершится!");
            return;// Прирывает метод Main
        }
        System.out.println("Программа работает без ограничений!");
    }
}
