public abstract class Parent implements ParentInterface {
    private String modelName;
    private int wheelsCount;

    public Parent(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public Parent() {

    }

    public String getModelName() {
        return modelName;
    }
      public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }
    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}
