public class Main {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.method("1"); // 클라이언트 인터페이스 스팩인 String 데이터 전송

    }
}

class SMSInfo{
    int TelNum;
    String MessageData;
}