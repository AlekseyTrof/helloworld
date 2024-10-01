public class lesson2 {
    public static void main(String[] args) {
        // task 1
        int id = 20;
        System.out.println("Значение переменной id с типом int равно " + id);
        byte add = 120;
        System.out.println("Значение переменной add с типом byte равно " + add);
        short food = 20;
        System.out.println(food);
        long sring = 10000L;
        System.out.println(sring);
        float lesson = 11.1f;
        System.out.println(lesson);
        double string = 203.4444;
        System.out.println(string);

        // task 2
        // подобрать типы данных для значений
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short f = -159;
        int e = 27897;
        byte g = 67;

        //task 3
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        int totalStudents =  lp + as + ea;
        short paper = 480;
        int paperStudents = paper / totalStudents;
        System.out.println("На каждого ученика расчитано " + paperStudents + " листов бумаги");

        // task 4
        byte bottle = 16;
        byte minute = 2;
        int bottleInOnceMinute = bottle / minute; // производительность бутылок в минуту
        int bottleIn20Minute = bottleInOnceMinute * 20; // производительность бутылок в 20 минут
        System.out.println("За 20 минут машина произвела " + bottleIn20Minute + " штук бутылок");

        int minuteInDay = 24 * 60;
        int minuteInThreeDay = minuteInDay * 3;
        int minuteInMonth = minuteInDay * 30;
        int bottleInDay = minuteInDay * bottleInOnceMinute;
        int bottleInThreeDay = minuteInThreeDay * bottleInOnceMinute;
        int bottleInMonth = minuteInMonth * bottleInOnceMinute;

        System.out.println("За сутки машина произвела " + bottleInDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottleInThreeDay + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottleInMonth + " штук бытулок");

        // task 5
        byte totalBottle = 120;
        byte bottleWhite = 2;
        byte bottleBrown = 4;
        //количество краски на класс
        int totalOnClass = bottleBrown + bottleWhite;
        // количество классов
        int classes = totalBottle / totalOnClass;
        // сколько нужно банок белой краски
        int totalWhite = classes * bottleWhite;
        // сколько нужно коричневой краски
        int totalBrown = totalBottle - totalWhite;
        System.out.println("В школе, где " + classes + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");

        // task 6
        byte bananas = 5;
        byte milkMl = 2; // 200 мл
        byte ice = 2;
        byte agg = 4;
        // переводим всё в граммы
        int grBananas = bananas * 80;
        int grMilkMl = milkMl * 105; // 100 мл = 105 гр
        int grIce = ice * 100;
        int grAgg = agg * 70;
        int grTotalFood = grAgg + grBananas + grIce + grMilkMl;
        // переведем в кг
        float kgTotalFood = grTotalFood / (float) 1000;
        System.out.println("На завтра спортсмент употребил " + grTotalFood + " грамм пиши, а это " + kgTotalFood + " кг.");

        // task 7
        byte manWeight = 7;
        short lostWeightInDay1 = 250;
        short lostWeightInDay2= 500;
        // перевем вес в граммы, сколько спортсмену нужно сбросить
        int lostWeight = manWeight * 1000;
        // найдем сколько дней нужно если терять по 250 грамм в день
        int needDayLost1 = lostWeight / lostWeightInDay1;
        // найдем сколько дней нужно если терять по 500 грамм в день
        int needDayLost2 = lostWeight / lostWeightInDay2;
        //найдем среднее количетсво дней, если заниматься умеренно
        int averageDatForLostWeight = (needDayLost1 + needDayLost2) / 2;
        System.out.println(needDayLost1 + " дней нужно, если скидывать по 250 гр в день");
        System.out.println(needDayLost2 + " дней нужно, если скидывать по 500 гр в день");
        System.out.println(averageDatForLostWeight + " дней нужно, если заниматься в среднем темпе");

        // task 8
        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        // узнаем годовую зп у каждого
        int yearMasha = masha * 12;
        int yearDenis = denis * 12;
        int yearKris = kris * 12;
        // увеличиваем каждому зп на 10 %
        double manyMasha = (masha * 0.1) + masha;
        double manyDenis = (denis * 0.1) + denis;
        double manyKris = (kris * 0.1) + kris;
        // узнаем годовую зп после повышения
        double totalYearManyMasha = manyMasha * 12;
        double totalYearManyDenis = manyDenis * 12;
        double totalYearManyKris = manyKris * 12;
        // узнаем разницу в годовых зп
        double difYearManyMasha = totalYearManyMasha - yearMasha;
        double difYearManyDenis = totalYearManyDenis - yearDenis;
        double difYearManyKris = totalYearManyKris - yearKris;
        System.out.println("Маша теперь получает " + manyMasha + " рублей. Годовой доход вырос на " + difYearManyMasha + " рублей");
        System.out.println("Денис теперь получает " + manyDenis + " рублей. Годовой доход вырос на " + difYearManyDenis + " рублей");
        System.out.println("Кристина теперь получает " + manyKris + " рублей. Годовой доход вырос на " + difYearManyKris + " рублей");
    }
}
