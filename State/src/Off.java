public class Off implements CapsLockState {
    @Override
    public void input(char in) {
        System.out.println(in);
    }

    @Override
    public void inputAndChangeState(char in, KeyBoard keyBoard) {
        System.out.println(in);
        keyBoard.setCapsLockState(new On()); // 상태 변경
    }
}
