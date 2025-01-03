import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> designPatten = new ArrayList<>();
        designPatten.add("Creational Patterns");
        designPatten.add("Structural Patterns");
        designPatten.add("Behavioral Patterns");

        Iterator<String> iterator = designPatten.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}