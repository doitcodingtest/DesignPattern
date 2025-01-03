import java.util.*;

public class StroageItem implements Item {
    String name;
    private final List<Item> items;

    public StroageItem(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    @Override
    public void displayName() {
        System.out.println("[" + name + "]");
        for (Item item : items) {
            item.displayName();
        }
    }

    public void add(Item i) {
        this.items.add(i);
    }

    public void remove(int i) {
        this.items.remove(i);
    }
}
