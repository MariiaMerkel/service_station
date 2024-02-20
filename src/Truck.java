public class Truck  extends Transport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    protected void check(){
        updateTyre();
        checkEngine();
        checkTrailer();
    };
    private void updateTyre() {
        for (int i = 0; i < this.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }
    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
