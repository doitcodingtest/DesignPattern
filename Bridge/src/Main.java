public class Main {
    public static void main(String[] args) {
        Tool redBrush = new Brush(new Red());
        redBrush.draw();
        Tool blueBrush = new Brush(new Blue());
        blueBrush.draw();
        Tool yellowBrush = new Brush(new Yellow());
        yellowBrush.draw();
        Tool redPencil = new Pencil(new Red());
        redPencil.draw();
        Tool bluePencil = new Pencil(new Blue());
        bluePencil.draw();
        Tool yellowPencil = new Pencil(new Yellow());
        yellowPencil.draw();
    }
}