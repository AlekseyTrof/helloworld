package skyPro_course2.lesson2;

public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Griffindor(String name, int magic, int transgress, int honor, int nobility, int courage) {
        super(name, magic, transgress);
        this.honor = honor;
        this.nobility = nobility;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return getName() +
                " - Magic - " + getMagic() +
                "; Transgress - " + getTransgress() +
                "; honor - " + getHonor() +
                "; nobility - " + getNobility() +
                "; courage - " + getCourage();
    }

    public static void comparison(Griffindor pers1, Griffindor pers2) {
        int sumPers1 = pers1.getHonor() + pers1.getMagic() + pers1.getTransgress() + pers1.getNobility() + pers1.getCourage();
        int sumPers2 = pers2.getHonor() + pers2.getMagic() + pers2.getTransgress() + pers2.getNobility() + pers2.getCourage();

        if (sumPers1 > sumPers2) {
            System.out.println(pers1.getName() + " лучший гриффиндорец, чем " + pers2.getName());
        } else if (sumPers2 > sumPers1){
            System.out.println(pers2.getName() + " лучший гриффиндорец, чем " + pers1.getName());
        } else {
            System.out.println("У " + pers1.getName() + " и " + pers2.getName() + " силы равны");
        }
    }
}