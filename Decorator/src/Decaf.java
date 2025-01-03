public class Decaf extends Decorator {
    public Decaf(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String add() {
        return "디카페인 전용 에스프레소";
    }
}
