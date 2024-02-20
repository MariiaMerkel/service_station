public abstract class Transport {
    private final String modelName;
    private final int wheelsCount;

    protected Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    protected abstract void check();

    protected String getModelName() {
        return modelName;
    }

    protected int getWheelsCount() {
        return wheelsCount;
    }
}
