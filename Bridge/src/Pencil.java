public class Pencil extends Tool {
    public Pencil(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println(color.name() + " 연필을 사용하여 그립니다");
    }
}
