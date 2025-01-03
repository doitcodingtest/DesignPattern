public class BicycleFactory extends AbstracFactory{
    @Override
    protected Vehicle createProduct() {
        return new Bicycle();
    }
}
