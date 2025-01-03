public abstract class Tool {
    protected Color color;
    public Tool(Color color) {
        this.color = color;
    }
    public abstract void draw();
}
