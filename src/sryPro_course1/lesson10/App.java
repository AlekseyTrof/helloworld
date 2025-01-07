package sryPro_course1.lesson10;

public class App {
    public static void main(String[] args) {
        Author lechenko = new Author("Ivan", "Lechenko");
        Author alex = new Author("Alex", "Aleksey");
        Book lev = new Book("Lev", lechenko.getLastName(), 1995);
        System.out.println("lev.getAuthor() = " + lev.getAuthor());
        Book doctor = new Book("Duality", "Hobbit", 2000);
        System.out.println("doctor.getAge() = " + doctor.getAge());
        doctor.setAge(2030);
        System.out.println("lev.getName() = " + lev.getName());
        System.out.println("doctor.getAge() = " + doctor.getAge());
        System.out.println("alex.getFirstName() = " + alex.getFirstName());
    }
}
