package streamHomeTask;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Евграф ", 33, Person.Gender.MALE));
        persons.add(new Person("Елизавета ", 29, Person.Gender.FEMALE));
        persons.add(new Person("Михаил ", 26, Person.Gender.MALE));
        persons.add(new Person("Марина ", 42, Person.Gender.FEMALE));
        persons.add(new Person("Александра ", 22, Person.Gender.FEMALE));
        persons.add(new Person("Александр ", 62, Person.Gender.MALE));
        persons.add(new Person("Володя ", 30, Person.Gender.MALE));
        persons.add(new Person("Дмитрий ", 12, Person.Gender.MALE));
        persons.add(new Person("Ярополк ", 31, Person.Gender.MALE));
        persons.add(new Person("Ольга ", 77, Person.Gender.FEMALE));

        persons.stream()
                .filter(age -> age.getAge() > 30)
                .forEach(System.out::println);


    }
}
