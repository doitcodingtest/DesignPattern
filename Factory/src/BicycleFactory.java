public class BicycleFactory extends AbstractFactory {
    @Override
    protected Vehicle createProduct() {
        return new Bicycle();
    }
}
