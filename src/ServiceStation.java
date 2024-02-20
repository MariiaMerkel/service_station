public class ServiceStation implements ServiceStationInterface {
    @Override
    public void service(Transport transport) {
        System.out.println();
        System.out.println("Обслуживаем " + transport.getModelName());
        transport.check();
    }
}