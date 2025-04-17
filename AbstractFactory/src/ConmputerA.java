public class ConmputerA implements Computer {
    public Mouse mouse;
    public Keyboard keyboard;
    public Monitor monitor;

    public ConmputerA() {
        System.out.println("A회사 컴퓨터를 생산합니다.");
        this.createMouse();
        this.createKeyBoard();
        this.createMonitor();
        System.out.println("A회사 컴퓨터를 완성했습니다.");
    }

    @Override
    public Mouse createMouse() {
        return new MouseA();
    }

    @Override
    public Keyboard createKeyBoard() {
        return new KeyboardA();
    }

    @Override
    public Monitor createMonitor() {
        return new MonitorA();
    }
}
