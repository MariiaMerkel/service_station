public class ServiceStation implements ServiceStationInterface {
    @Override
    public void check(Transport transport) {
        System.out.println();
        System.out.println("Обслуживаем " + transport.getModelName());
        String s = transport.getClass().getName();
        switch (s) {
            case "Car":
                check((Car) transport);
                break;
            case "Truck":
                check((Truck) transport);
                break;
            case "Bicycle":
                check((Bicycle) transport);
                break;
        }
    }

    @Override
    public void check(Bicycle bicycle) {
        bicycle.updateTyre();
    }

    @Override
    public void check(Car car) {
        car.updateTyre();
        car.checkEngine();
    }

    @Override
    public void check(Truck truck) {
        truck.updateTyre();
        truck.checkEngine();
        truck.checkTrailer();
    }
}
