public class CarFactory extends AbstractFactory {
    @Override
    protected Vehicle createProduct() {
        return new Car();
    }
}
