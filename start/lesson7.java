import java.util.Arrays;
public class lesson7 {
    public static void main(String[] args) {
        // task 1
        /*
        Объявите три массива:
         */
        int[] numbersInt = new int[4];
        double[] numbersDouble = {1.57, 7.654, 9.986};
        int[] integers = {1, 2, 3, 4, 6, 20 ,2133, 32145, 3254131, 1242141};

        // task 2
        /*
        Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
        В конце строки запятую ставить не надо.
         */
        for (int i = 0; i < numbersInt.length; i++) {
           if (i == numbersInt.length - 1) {
               System.out.println(numbersInt[i]);
               break;
           }
            System.out.print(numbersInt[i] + ", ");
        }

        for (int i = 0; i < numbersDouble.length; i++) {
            if (i == numbersDouble.length - 1) {
                System.out.println(numbersDouble[i]);
                break;
            }
            System.out.print(numbersDouble[i] + ", ");
        }

        for (int i = 0; i < integers.length; i++) {
            if (i == integers.length - 1) {
                System.out.println(integers[i]);
                break;
            }
            System.out.print(integers[i] + ", ");
        }

        // task 3
        /*
        Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
        В конце строки запятую ставить не надо.
         */
        for (int i = numbersInt.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(numbersInt[0]);
                break;
            }
            System.out.print(numbersInt[i] + ", ");
        }

        for (int i = numbersDouble.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(numbersDouble[0]);
                break;
            }
            System.out.print(numbersDouble[i] + ", ");
        }

        for (int i = integers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(integers[0]);
                break;
            }
            System.out.print(integers[i] + ", ");
        }

        // task 4
        /*
        Пройдитесь по любому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
         */

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 != 0) {
                integers[i]++;
            }
        }
        System.out.print(Arrays.toString(integers));
    }
}
