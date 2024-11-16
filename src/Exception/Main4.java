package Exception;

import java.lang.annotation.ElementType;

public class Main4 {
    /**
     *  finally
     */
    public static void main(String[] args) {
        int divider = 0;
        int element = 0;
        int [] array = new int [1];
        int i = 0;
        try {
            int result = 10 / divider;
        } catch (ArithmeticException e){
            System.out.println("Деление на ноль!");
        } finally {
            if (array.length > 0){
                try {
                    array[i] = 1;
                    element = array[0];
                    System.out.println("Элемент массива равен " + element);
                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Выход за пределы массива!");
                }


            }else {
                throw new ArrayIndexOutOfBoundsException("Неврзмлжно вернуть элемент. Его не сущестует!");
            }
        }

    }
}
