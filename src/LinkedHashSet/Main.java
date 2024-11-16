package LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Person> personHashSet = new  TreeSet<>(new PerconComparator());
        personHashSet.add(new Person("Павел!", "19"));
        personHashSet.add(new Person("Анна!", "22"));
        personHashSet.add(new Person("Сергей!", "45"));
        personHashSet.add(new Person("Михаил!", "65"));
        personHashSet.add(new Person("Сергей!", "45"));
        System.out.println(personHashSet);


    }
}
