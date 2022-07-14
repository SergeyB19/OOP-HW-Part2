public class Main {
    public static void main(String[] args) {
            CheckMachines car = new Car();
            CheckMachines car2 = new Car();
            car.setModelName("car1");
            car2.setModelName("car2");
            car.setWheelsCount(4);
            car2.setWheelsCount(4);

            CheckMachines truck = new Truck();
            CheckMachines truck2 = new Truck();
            truck.setModelName("truck1");
            truck2.setModelName("truck2");
            truck.setWheelsCount(6);
            truck2.setWheelsCount(8);

            CheckMachines bicycle = new Bicycle();
            CheckMachines bicycle2 = new Bicycle();
            bicycle.setModelName("bicycle1");
            bicycle2.setModelName("bicycle2");
            bicycle.setWheelsCount(2);
            bicycle2.setWheelsCount(2);
            car.check();

            ServiceStation station = new ServiceStation();
            station.check(car, null, null);
            station.check(car2, null, null);
            station.check(null, bicycle, null);
            station.check(null, bicycle2, null);
            station.check(null, null, truck);
            station.check(null, null, truck2);

            ServiceStation serviceStation = new ServiceStation();
            serviceStation.print(bicycle);
            serviceStation.print(car);
            serviceStation.print(truck);


        }

}
