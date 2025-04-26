public class Main {
    public static void main(String[] args) {
        StorageItem inventory = new StorageItem("인벤토리");
        inventory.add(new NormalItem("칼"));
        inventory.add(new NormalItem("방패"));

        StorageItem myBag = new StorageItem("물약 가방");
        inventory.add(myBag);
        myBag.add(new NormalItem("회복 물약"));
        myBag.add(new NormalItem("마나 물약"));

        StorageItem specialBag = new StorageItem("스페셜 가방");
        specialBag.add(new NormalItem("비법서"));
        specialBag.add(new NormalItem("다이아몬드"));
        inventory.add(specialBag);
        myBag.remove(1);

        inventory.displayName();
    }
}
