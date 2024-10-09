package lesson10;

public class Book {
    private final String name;
    private final String Author;
    int age;

    public Book(String name, String Author, int age) {
        this.name = name;
        this.Author = Author;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public String getAuthor() {
        return this.Author;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
