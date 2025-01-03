public class Brush extends Tool{
    public Brush(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println(color.name()+" 붓을 사용하여 그립니다");
    }
}
