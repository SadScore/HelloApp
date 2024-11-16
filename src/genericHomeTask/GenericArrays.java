package genericHomeTask;

/**
 * 1) Напишите метод, который принимает два массива одного типа и проверяет,
 * содержат ли они одинаковые элементы в одном и том же порядке
 * 2) Напишите универсальный метод, чтобы обмениваться позициями двух различных элементов в массиве
 */


public class GenericArrays<Skuff> {
    Skuff[] ArrayOne;
    Skuff[] arrayTwo;

    public GenericArrays(Skuff[] ArrayOne, Skuff[] arrayTwo) {
        this.ArrayOne = ArrayOne;
        this.arrayTwo = arrayTwo;
    }

    public Skuff[] getArrayOne() {
        return ArrayOne;
    }

    public Skuff[] getArrayTwo() {
        return arrayTwo;
    }

    public static <Skuff> boolean compare(Skuff[] ArrayOne, Skuff[] arrayTwo) {
        if (ArrayOne.length != arrayTwo.length) {

            return false;
        }
        for (int i = 0; i < ArrayOne.length - 1; i++) {
            if (!ArrayOne[i].equals(arrayTwo[i])) {
                System.out.println("Порядок не совпадает!");
                return false;
            }

        }
        System.out.println("Порядок совпадает!");

        return true;
    }

    public static <Skuff> void switchEntryAtIndex(Skuff[] ArrayOne, Skuff[] arrayTwo, int index) {
        if (index >= ArrayOne.length || index >= arrayTwo.length) {
            throw new IndexOutOfBoundsException("Индекс элемента больше размера массивов!!!");
        }

        var entry = arrayTwo[index];
        arrayTwo[index] = ArrayOne[index];
        ArrayOne[index] = entry;
        System.out.println("Обмен элементами по индексу " + index + " успешно завершен");
    }

}
