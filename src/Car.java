public class Car  extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    protected void check() {
        updateTyre();
        checkEngine();
    }

    private void updateTyre() {
        for (int i = 0; i < this.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
