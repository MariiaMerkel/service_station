public class ServiceStation implements ServiceStationInterface {
    @Override
    public void check(Transport transport) {
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
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }

    @Override
    public void check(Car car) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
        }
    }

    @Override
    public void check(Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        }
    }
}
