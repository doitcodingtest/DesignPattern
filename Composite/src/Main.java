public class Main {
    public static void main(String[] args) {
        StroageItem inventory = new StroageItem("인벤토리");
        inventory.add(new NormalItem("칼"));
        inventory.add(new NormalItem("방패"));

        StroageItem myBag = new StroageItem("물약가방");
        inventory.add(myBag);
        myBag.add(new NormalItem("회복물약"));
        myBag.add(new NormalItem("마나물약"));

        StroageItem specialBag = new StroageItem("스페셜가방");
        specialBag.add(new NormalItem("비법서"));
        specialBag.add(new NormalItem("다이아몬드"));
        inventory.add(specialBag);
        myBag.remove(1);

        inventory.displayName();
    }
}