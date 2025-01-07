package skyPro_course2.lesson2;

public class Objects {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor( "Гарри" ,90, 80, 85, 80, 90);
        Griffindor germionaGr = new Griffindor("Гермиона",85, 80, 85, 70, 75);
        Griffindor ronWuzly = new Griffindor("Рон",70, 60, 65, 70, 80);

        Slizerin dragoMal = new Slizerin("Драго",90, 80, 85, 90, 80, 75, 90);
        Slizerin grehemMon = new Slizerin("Грэхэм",80, 70, 60, 75, 75, 80, 85);
        Slizerin gregoryGoyl = new Slizerin("Грегори",60, 70, 65, 50, 70, 80, 75);

        Puffenduy zahariySmit = new Puffenduy("Захария",90, 95, 80, 85, 90);
        Puffenduy sedrikDig = new Puffenduy("Седрик",80, 85, 70, 75, 80);
        Puffenduy dgastinFinch = new Puffenduy("Джастин",60, 50, 70, 80, 85);

        Cogtevran chgoyChan = new Cogtevran("Чжоу",90, 80, 85, 90, 95, 70);
        Cogtevran padmaPatil = new Cogtevran("Падма",80, 70, 75, 60, 65, 70);
        Cogtevran marcusBel = new Cogtevran("Маркус",60, 50, 55, 60, 70, 65);

        System.out.println(chgoyChan);
        System.out.println(harryPotter);
        System.out.println(zahariySmit);
        System.out.println(dragoMal);

        Cogtevran.comparison(chgoyChan, padmaPatil);
        Griffindor.comparison(harryPotter, germionaGr);
        Slizerin.comparison(dragoMal, gregoryGoyl);
        Cogtevran.comparison(chgoyChan, marcusBel);

        Hogwarts.comparisonHog(harryPotter, dragoMal);
    }
}
