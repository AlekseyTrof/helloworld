package skyPro_course2.lesson2;

public class Cogtevran extends Hogwarts {
    private int clever;
    private int wise;
    private int witty;
    private int creative;

    public Cogtevran(String name, int magic, int transgress, int clever, int wise, int witty, int creative) {
        super(name, magic, transgress);
        this.clever = clever;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getClever() {
        return clever;
    }

    public void setClever(int clever) {
        this.clever = clever;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return getName() +
                " - Magic - " + getMagic() +
                "; Transgress - " + getTransgress() +
                "; clever - " + getClever() +
                "; wise - " + getWise() +
                "; witty - " + getWitty() +
                "; creative - " + getCreative();
    }

    public static void comparison(Cogtevran pers1, Cogtevran pers2) {
        int sumPers1 = pers1.getClever() + pers1.getMagic() + pers1.getTransgress() + pers1.getWise() + pers1.getWitty() + pers1.getCreative();
        int sumPers2 = pers2.getClever() + pers2.getMagic() + pers2.getTransgress() + pers2.getWise() + pers2.getWitty() + pers2.getCreative();

        if (sumPers1 > sumPers2) {
            System.out.println(pers1.getName() + " лучший когтевранец, чем " + pers2.getName());
        } else if (sumPers2 > sumPers1){
            System.out.println(pers2.getName() + " лучший когтевранец, чем " + pers1.getName());
        } else {
            System.out.println("У " + pers1.getName() + " и " + pers2.getName() + " силы равны");
        }
    }
}