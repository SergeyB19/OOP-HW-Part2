public class Car extends Parent {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Car() {
        super();
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
