package skyPro_course2.lesson2;

public class Puffenduy extends Hogwarts {
    private int hardworking;
    private int faithful;
    private int honest;

    public Puffenduy(String name, int magic, int transgress, int hardworking, int faithful, int honest) {
        super(name, magic, transgress);
        this.hardworking = hardworking;
        this.faithful = faithful;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getFaithful() {
        return faithful;
    }

    public void setFaithful(int faithful) {
        this.faithful = faithful;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public String toString() {
        return getName() +
                " - Magic - " + getMagic() +
                "; Transgress - " + getTransgress() +
                "; hardworking - " + getHardworking() +
                "; faithiful - " + getFaithful() +
                "; honest - " + getHonest();
    }

    public static void comparison(Puffenduy pers1, Puffenduy pers2) {
        int sumPers1 = pers1.getHardworking() + pers1.getMagic() + pers1.getTransgress() + pers1.getFaithful() + pers1.getHonest();
        int sumPers2 = pers2.getHardworking() + pers2.getMagic() + pers2.getTransgress() + pers2.getFaithful() + pers2.getHonest();

        if (sumPers1 > sumPers2) {
            System.out.println(pers1.getName() + " лучший пуффендуец, чем " + pers2.getName());
        } else if (sumPers2 > sumPers1){
            System.out.println(pers2.getName() + " лучший пуффендуец, чем " + pers1.getName());
        } else {
            System.out.println("У " + pers1.getName() + " и " + pers2.getName() + " силы равны");
        }
    }
}
