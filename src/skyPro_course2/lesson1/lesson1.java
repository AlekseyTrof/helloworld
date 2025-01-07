package skyPro_course2.lesson1;

import java.util.Arrays;

public class lesson1 {
    public static void main(String[] args) {
        //task 1.5
        // если распечатать переменную в методе main, то какое у нее будет значение?
        int valueInt = 33;
        changeValue(valueInt);
        System.out.println(valueInt);

        // task 1.6
        // если распечатать переменную в методе main, то какое у нее будет значение?
        Integer valueInteger = 33;
        changeValue(valueInteger);
        System.out.println(valueInteger);

        // task 1.7
//        Integer[] valueIntegerArr = new Integer[2];
//        valueIntegerArr[0] = 3;
//        valueIntegerArr[1] = 4;
//        changeValue(valueIntegerArr);
//        System.out.println(Arrays.toString(valueIntegerArr));

        // task 1.8
        Integer[] valueIntegerArr = new Integer[2];
        valueIntegerArr[0] = 3;
        valueIntegerArr[1] = 4;
        changeValue(valueIntegerArr);
        System.out.println(Arrays.toString(valueIntegerArr));

        // task 1.9 and 1.10
        /*
        Объявите объект класса person с полями name и surname.
        Переопределите у него метод toString так, чтобы он возвращал строку из name и surname.
        Объявите метод changePerson, который принимает параметр типа Person под названием person.
        Внутри метода с помощью оператора присваивания запишите в параметр новый объект типа Person.
        Присвойте строке name значение Ilya, строке surname — значение Lagutenko.
        В методе main объявите переменную типа Person под названием person и запишите новый объект типа Person.
        Присвойте строке name значение Lyapis, строке surname значение — Trubetskoy.
        В следующей строке вызовите метод changePerson и передайте в него эту переменную.
        */
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);
    }

    public static void changeValue(int value) {
        // для задачи 1.5
        value = 22;
    }

    public static void changeValue(Integer value) {
        // для задачи 1.6
        value = 22;
    }

    public static void changeValue(Integer[] value) {
        // для задачи 1.7, 1.8
        value[0] = 99;
    }

    public static void changePerson(Person person) {
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }

}
