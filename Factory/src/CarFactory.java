public class CarFactory extends AbstracFactory{
    @Override
    protected Vehicle createProduct() {
        return new Car();
    }
}
