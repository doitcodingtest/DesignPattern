public class MotorcycleFactory extends AbstractFactory {
    @Override
    protected Vehicle createProduct() {
        return new Motorcycle();
    }
}
