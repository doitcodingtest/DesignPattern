public class MotorcycleFactory extends AbstracFactory{
    @Override
    protected Vehicle createProduct() {
        return new Motorcycle();
    }
}
