public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Motorcycle();
        vehicle.deliver();

        Vehicle vehicle2 = new Bicycle();
        vehicle2.deliver();

        Vehicle vehicle3 = new Car();
        vehicle3.deliver();
    }
}