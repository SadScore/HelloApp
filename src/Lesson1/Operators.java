package Lesson1;

public class Operators {
    public static void main(String[] args) {
        /**
         * Коммментарии
         */

        // ОДНОСТРОЧНЫЙ комментарий

        /*
        Многострочный коментарий
        Привет и тд.
         */

        // TODO СЛУЖЕБНЫЙ КОММЕНТАРИЙ











        int a = 5;
        a += 10; // a = a + 10 = 15;
        a -= 3; // a = a - 3 = 12;
        a *= 2; // a = a * 2 = 24;
        a /= 6; // a = a / 6 = 4;
        a %= 3; // a = a % 3 = 1;
        System.out.println(a);


        int minSalary = 16;
        int mySalary = 30;
        int wifeSalary = 15;
        boolean resultOne = (mySalary > minSalary) && (wifeSalary > minSalary);
        boolean resultTwo = (mySalary > minSalary) || (wifeSalary > minSalary);
        System.out.println("У обоих супругов зарплата выше МРОТ? " + resultOne);
        System.out.println("Хоть чья-то зарплата удовлетворяет? " + resultTwo);

    }
}
