public class Bicycle extends Parent {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Bicycle() {
        super();
    }


    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
