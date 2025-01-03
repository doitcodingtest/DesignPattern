public class NormalItem implements Item {
    String name;

    public NormalItem(String name) {
        this.name = name;
    }

    @Override
    public void displayName() {
        System.out.println(name);
    }
}
