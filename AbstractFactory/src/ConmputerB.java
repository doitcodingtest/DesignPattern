public class ConmputerB implements Computer {
    public Monitor monitor;
    public Keyboard keyboard;
    public Mouse mouse;

    public ConmputerB() {
        System.out.println("B회사 컴퓨터를 생산합니다.");
        this.createKeyBoard();
        this.createMouse();
        this.createMonitor();
        System.out.println("B회사 컴퓨터를 완성하였습니다.");
    }
    @Override
    public Mouse createMouse() {
        return new MouseB();
    }

    @Override
    public Keyboard createKeyBoard() {
        return new KeyboardB();
    }

    @Override
    public Monitor createMonitor() {
        return new MonitorB();
    }
}
