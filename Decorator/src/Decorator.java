abstract public class Decorator implements Coffee {
    private final Coffee coffee;

    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String add() {
        return coffee.add();
    }
}
