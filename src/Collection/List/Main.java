package Collection.List;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("яблоко");
        list.add("ананас");
        list.add("яблоко");
        list.add(1,"груша");
        list.set (0, "лимон");
        System.out.println(list);
        System.out.println(list.indexOf("яблоко"));

        ArrayList<String> listTwo = new ArrayList<>();
        listTwo.add("яблоко");
        listTwo.add("груша");
        listTwo.add("арбуз");
        listTwo.add("слива");
        list.removeAll(listTwo);
        System.out.println(list);



    }
}
