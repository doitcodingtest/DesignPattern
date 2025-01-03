public class Milk extends Decorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String add() {
        return super.add() + " + " + milkAdd();
    }

    public String milkAdd() {
        return "우유";
    }
}
