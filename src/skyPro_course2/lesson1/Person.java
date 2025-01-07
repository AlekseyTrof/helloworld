package skyPro_course2.lesson1;

public class Person {
    public String name;
    public String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "name - " + this.name + ", surname - " + this.surname;
    }
}
