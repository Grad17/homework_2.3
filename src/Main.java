public class Main {
    public static void main(String[] args) {
        Station car = new Car("car1", 4);
        Station car2 = new Car("car2", 4);
        Station truck = new Truck("truck1", 6);
        Station truck2 = new Truck("truck2", 8);
        Station bicycle = new Bicycle("bicycle1", 2);
        Station bicycle2 = new Bicycle("bicycle2", 2);

        car.check();
        System.out.println("============================");
        bicycle2.check();
        System.out.println("============================");
        truck.check();
//        car.modelName = ;
//        car2.modelName = ;
//        car.wheelsCount = ;
//        car2.wheelsCount = 4;

//        truck.modelName = ;
//        truck2.modelName = ;
//        truck.wheelsCount = 6;
//        truck2.wheelsCount = 8;

//        bicycle.modelName = ;
//        bicycle2.modelName = "bicycle2";
//        bicycle.wheelsCount = 2;
//        bicycle2.wheelsCount = 2;

//        ServiceStation station = new ServiceStation();
//        station.check(car, null, null);
//        station.check(car2, null, null);
//        station.check(null, bicycle, null);
//        station.check(null, bicycle2, null);
//        station.check(null, null, truck);
//        station.check(null, null, truck2);
    }
}