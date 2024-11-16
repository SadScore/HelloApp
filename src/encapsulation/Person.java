package encapsulation;

public class Person {
    private String name;
    private int age;
    private String phone;

    @Override
    public String toString() {
        return "Person " +
                "Имя='" + name + '\'' +
                ", возраст=" + age +
                ", телефон='" + phone + '\'' +
                '}';
    }

    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

}

