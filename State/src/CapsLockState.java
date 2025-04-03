public interface CapsLockState {
    void input(char in);

    void inputAndChangeState(char in, KeyBoard keyBoard); //입력 후 상태가 바뀌는 함수
}
