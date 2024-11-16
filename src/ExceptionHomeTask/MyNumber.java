package ExceptionHomeTask;

public class MyNumber { // просто название класса
    /**
     * Напишите метод, который принимает целое число в качестве параметра и выдает исключение, если число нечетное.
     * Необходимо протестировать ее в методе main с разными числами.
     */
    public int isEvenNumber(int number){ // вот тут же int в методе целое число. Причем тут Number???
        if (number % 2 != 0 ){
            throw new ArithmeticException("Ошибка!!! число " + number + " НЕЧЕТНОЕ!");

        }else {
            System.out.println("Всё хорошо! Число " + number + " четное!");

        }
        System.out.println(number + number);

        return number;
    }
}
