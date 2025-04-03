public class KeyBoard {
    private CapsLockState capsLockState;

    public KeyBoard() {
        this.capsLockState = new Off();
    }

    public void setCapsLockState(CapsLockState capsLockState) {
        this.capsLockState = capsLockState;
    }

    public void input(char in) {
        capsLockState.input(in);
    }

    public void inputAndChangeState(char in) {
        capsLockState.inputAndChangeState(in, this);
    }
}
