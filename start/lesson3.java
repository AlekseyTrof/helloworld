public class lesson3 {
    public static void main(String[] args) {

        int day = 19;
        boolean noSanitaryDay = day != 15;

        if (!noSanitaryDay) {
            System.out.println("Сегодня санитарный день");
        } else {
            System.out.println("Сегодня обычный рабочий день");
        }

    }
}