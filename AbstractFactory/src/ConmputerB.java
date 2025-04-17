public class ConmputerB implements Computer {
    public Mouse mouse;
    public Keyboard keyboard;
    public Monitor monitor;

    public ConmputerB() {
        System.out.println("B회사 컴퓨터를 생산합니다.");
        this.createMouse();
        this.createKeyBoard();
        this.createMonitor();
        System.out.println("B회사 컴퓨터를 완성했습니다.");
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
