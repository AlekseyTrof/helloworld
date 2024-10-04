public class lesson8 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        // generateRandomArray() — вызов метода «сгенерироватьМассив»
        /*
        Бухгалтеры попросили посчитать сумму всех выплат за месяц.
         */
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        /*
        Также бухгалтерия попросила найти минимальную и максимальную трату за месяц.
        Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
        «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
         */
        int[] arr = generateRandomArray();
        int maxTotalOfMonth = 99_000;
        int minTotalOfMonth = 200_001;
        // рассчитываем максимальную сумму за месяц
        for (int index : arr) {
            if (index > maxTotalOfMonth) {
                maxTotalOfMonth = index;
            }
        }
        // рассчитываем минимальную сумму за месяц
        for (int index : arr) {
            if (index < minTotalOfMonth) {
                minTotalOfMonth = index;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minTotalOfMonth
                + " рублей. Максимальная сумма трат за день составила " + maxTotalOfMonth + " рублей.");
    }

    public static void task3() {
        /*
        Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
        Напишите программу, которая посчитает среднее значение трат за месяц,
        и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
         */
        int[] arr = generateRandomArray();
        int sum = 0;
        // находим сумму за месяц
        for (int index : arr) {
                sum += index;
        }
        // находим какую сумму компания тратила за месяц
        int mediumSum = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + mediumSum + " рублей.");
    }

    public static void task4() {
        /*
        В бухгалтерской книге появился баг. Что-то пошло не так:
        фамилии и имена сотрудников начали отображаться в обратную сторону.
        Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ».
        Данные с именами сотрудников хранятся в виде массива символов char[ ].
        Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде.
        В качестве данных для массива используйте:
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        В результате в консоль должно быть выведено: Ivanov Ivan.
         */
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int index = reverseFullName.length - 1; index >= 0; index--) {
            System.out.print(reverseFullName[index]);
        }
    }
}
