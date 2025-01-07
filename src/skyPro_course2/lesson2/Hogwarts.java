package skyPro_course2.lesson2;

public abstract class Hogwarts {
        private String name;
        private int magic;
        private int transgress;

        public Hogwarts(String name, int magic, int transgress) {
                this.name = name;
                this.magic = magic;
                this.transgress = transgress;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getMagic() {
                return magic;
        }

        public int getTransgress() {
                return transgress;
        }

        public void setMagic(int magic) {
                this.magic = magic;
        }

        public void setTransgress(int transgress) {
                this.transgress = transgress;
        }

        public static void comparisonHog(Hogwarts pers1, Hogwarts pers2) {
                int sumPers1 = pers1.getMagic() + pers1.getTransgress();
                int sumPers2 = pers2.getMagic() + pers2.getTransgress();

                if (sumPers1 > sumPers2) {
                        System.out.println(pers1.getName() + " - сильнее, чем - " + pers2.getName());
                } else if (sumPers2 > sumPers1) {
                        System.out.println(pers2.getName() + " - сильнее, чем - " + pers1.getName());
                } else {
                        System.out.println("У " + pers1.getName() + " равная сила с " + pers2.getName());
                }
        }
}
