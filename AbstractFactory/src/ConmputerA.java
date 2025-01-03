public class ConmputerA implements Computer {
    public Monitor monitor;
    public Keyboard keyboard;
    public Mouse mouse;


    public ConmputerA() {
        System.out.println("A회사 컴퓨터를 생산합니다.");
        this.createKeyBoard();
        this.createKeyBoard();
        this.createKeyBoard();
        System.out.println("A회사 컴퓨터를 완성하였습니다.");
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
