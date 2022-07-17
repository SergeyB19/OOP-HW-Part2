public class Bicycle extends WheelableTransport implements Servicable {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у велосипеда");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем  " + getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            updateTyre();
        }
    }
}
