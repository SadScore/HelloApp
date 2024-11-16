package EnumClassWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Enum перечисление
 */

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Яблоки", "32.0", Product.Type.FRUIT));
        products.add(new Product("Говядина", "465.0", Product.Type.MEAT));
        products.add(new Product("Груша", "45.0", Product.Type.FRUIT));
        products.add(new Product("Семга", "320.0", Product.Type.FISH));
        products.add(new Product("Свинина", "328.0", Product.Type.MEAT));
        products.add(new Product("Форель", "3299.0", Product.Type.FISH));
        products.add(new Product("Апельсин", "98.0", Product.Type.FRUIT));

        System.out.println(Product.Type.FISH.ordinal());


    }
}







