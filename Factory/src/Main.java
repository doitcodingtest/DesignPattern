public class Main {
    public static void main(String[] args) {
        MotorcycleFactory motorcycleFactory = new MotorcycleFactory();
        Vehicle vehicle = motorcycleFactory.createProduct();
        vehicle.deliver();

        BicycleFactory bicycleFactory = new BicycleFactory();
        Vehicle vehicle2 = bicycleFactory.createProduct();
        vehicle2.deliver();

        CarFactory carFactory = new CarFactory();
        Vehicle vehicle3 = carFactory.createProduct();
        vehicle3.deliver();
    }
}