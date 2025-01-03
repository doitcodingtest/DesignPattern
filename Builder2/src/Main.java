public class Main {
    public static void main(String[] args) {
       Person person = new Person("김하루", 39);
       Builder textBuilder = new TextBuilder(person);
       Director director = new Director(textBuilder);
       System.out.println(director.make());

       Builder jsonBuilder = new JsonBuilder(person);
       director.setBuilder(jsonBuilder);
       System.out.println(director.make());
    }
}