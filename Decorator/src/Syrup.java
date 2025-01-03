public class Syrup extends Decorator {
    public Syrup(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String add() {
        return super.add() + " + " + syrupAdd();
    }

    public String syrupAdd() {
        return "바닐라시럽";
    }
}
