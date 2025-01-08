package skyPro_course2.lesson3;

public class Car extends Transports {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

}
