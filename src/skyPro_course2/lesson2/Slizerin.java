package skyPro_course2.lesson2;

public class Slizerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slizerin(String name, int magic, int transgress, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magic, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return getName() +
                " - Magic - " + getMagic() +
                "; Transgress - " + getTransgress() +
                "; cunning - " + getCunning() +
                "; determination - " + getDetermination() +
                "; ambition - " + getAmbition() +
                "; resourcefulness - " + getResourcefulness() +
                "; lustForPower - " + getLustForPower();
    }

    public static void comparison(Slizerin pers1, Slizerin pers2) {
        int sumPers1 = pers1.getCunning() + pers1.getMagic() + pers1.getTransgress() + pers1.getDetermination() +
                pers1.getAmbition() + pers1.getResourcefulness() + pers1.getLustForPower();

        int sumPers2 = pers2.getCunning() + pers2.getMagic() + pers2.getTransgress() + pers2.getDetermination() +
                pers2.getAmbition() + pers2.getResourcefulness() + pers2.getLustForPower();

        if (sumPers1 > sumPers2) {
            System.out.println(pers1.getName() + " лучший слизеринец, чем " + pers2.getName());
        } else if (sumPers2 > sumPers1) {
            System.out.println(pers2.getName() + " лучший слизеринец, чем " + pers1.getName());
        } else {
            System.out.println("У " + pers1.getName() + " и " + pers2.getName() + " силы равны");
        }
    }
}
