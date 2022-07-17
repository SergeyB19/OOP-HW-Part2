public class Main {
    public static void main(String[] args) {
            Servicable car = new Car("car1",4);
            Servicable car2 = new Car("car2",4);


            Servicable truck = new Truck("truck1",6);
            Servicable truck2 = new Truck("truck2",8);


            Servicable bicycle = new Bicycle("bicycle1",2);
            Servicable bicycle2 = new Bicycle("bicycle2",2);



            ServiceStation station = new ServiceStation();
            station.check(car);
            station.check(car2);
            station.check(bicycle);
            station.check(bicycle2);
            station.check(truck);
            station.check(truck2);
        }
}
