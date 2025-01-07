package sryPro_course1;

public class lesson9 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        // Представьте, что вы работаете в небольшой компании.
        // Данные сотрудников хранятся в неструктурированном формате.
        // Бухгалтерия попросила написать программу, в которой можно работать с Ф. И. О. сотрудников.

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника - " + fullName);
    }

    public static void task2() {
        // Для ежемесячного отчета и ведения документации бухгалтерии нужны Ф. И. О. сотрудников,
        // полностью написанные заглавными буквами (верхним регистром).
        // Напишите программу, которая изменит написание Ф. И. О. сотрудника с Ivanov Ivan Ivanovich на полностью заглавные буквы.
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        String upFullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета - " + upFullName);
    }

    public static void task3() {
        /*
        Система, в которой мы работаем, не принимает символ «ё».
        Напишите программу, которая заменяет символ «ё» на символ «е».
         */
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        String replaceFullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника - " + replaceFullName);
    }
}
