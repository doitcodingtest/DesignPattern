public class On implements CapsLockState {
    @Override
    public void input(char in) {
        System.out.println((char) (in - 32)); //대문자 변환 (아스키 코드 연산)
    }

    @Override
    public void inputAndChangeState(char in, KeyBoard keyBoard) {
        System.out.println((char) (in - 32));
        keyBoard.setCapsLockState(new Off()); // 상태 변경
    }
}
