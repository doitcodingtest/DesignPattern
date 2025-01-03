public class Water extends Decorator {
    public Water(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String add() {
        return super.add() + " + " + waterAdd();
    }

    public String waterAdd() {
        return "물";
    }
}
