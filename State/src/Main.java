public class Main {
    public static void main(String[] args) {
        On on = new On();
        KeyBoard keyBoard = new KeyBoard();
        keyBoard.input('a');                  // Caps Lock : Off
        keyBoard.input('b');                  // Caps Lock : Off
        keyBoard.setCapsLockState(on);        // Caps Lock : Off -> On
        keyBoard.inputAndChangeState('a');   // Caps Lock : On  -> Off
        keyBoard.input('b');                  // Caps Lock : Off
        keyBoard.setCapsLockState(on);        // Caps Lock : Off -> On
        keyBoard.input('b');                  // Caps Lock : On
    }
}