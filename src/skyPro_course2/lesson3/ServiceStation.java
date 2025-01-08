package skyPro_course2.lesson3;

public class ServiceStation implements Service {

    public void check(Transports transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                transport.updateTyre();
            }
            transport.checkEngine();
            transport.checkTrailer();
        }
    }
}
