package LinkedHashSet;

import java.util.Comparator;
import java.util.Objects;

public class Person  {
    String name;
    String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }




}
class PerconComparator implements Comparator<Person>{

    @Override
    public int compare(Person person1, Person person2) {
        return person1.age.compareTo(person2.age);
    }
}