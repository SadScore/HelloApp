package Collection.List;

import java.util.LinkedList;
import java.util.List;

public class MyMain {
    public static void main(String[] args) {
        List <String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.addFirst("zero");
        list.addLast("three");
        System.out.println(list);
        list.remove("three");
        System.out.println(list);

    }
}
