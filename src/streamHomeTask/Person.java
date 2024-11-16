package streamHomeTask;

/**
 * Создать класс Person с полями name и age. В классе с методом main создать список, состоящий не менее,
 * чем из 10 объектов класса Person с произвольными данными.
 * Отфильтровать и вывести в консоль объекты Person, возраст которых более 30 лет.
 */
public class Person {
    private String name;
    private int age;
    private Gender gender;
    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Человек у нас такой {" +
                "Имя: " + name + '\'' +
                ", Возраст: " + age +
                ", Пол: " + gender +
                '}';
    }
    enum Gender {
        FEMALE,
        MALE;


    }
}
