package sryPro_course1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class lesson1 {
    public static void main(String[] args) {

        // Задание 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задание 2
        var boxDog = dog + 4;
        var boxCat = cat + 4;
        var boxPaper = paper + 4;

        System.out.println(boxDog);
        System.out.println(boxCat);
        System.out.println(boxPaper);

        // Задание 3
        var minusDog = dog - 3.4;
        var minusCat = cat - 1.6;
        var minusPaper = paper - 7639;

        System.out.println(minusDog);
        System.out.println(minusCat);
        System.out.println(minusPaper);

        // Задание 4
        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        // Задание 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 5;
        System.out.println(frog);

        // Задача 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        var differenceWeight = boxer2 - boxer1;
        System.out.println(totalWeight);
        System.out.println(differenceWeight);

        // Задача 7
        var differenceWeight1 = boxer2 - boxer1;
        var differenceWeight2 = (totalWeight) % boxer1;
        System.out.println(differenceWeight1);
        System.out.println(differenceWeight2);

        // Задача 8.1
        var totalHours = 640;
        var onceMenHours = 8;
        var totalMen = totalHours / onceMenHours;
        System.out.println(totalMen);
        // Задача 8.2
        var totalMenWomen = totalMen + 94;
        var hoursPerson = totalHours / totalMenWomen;
        System.out.println("Если в компании работает " + totalMenWomen + " человек, то всего " + hoursPerson + " часа работы может быть поделено между сотрудниками");
    }
}