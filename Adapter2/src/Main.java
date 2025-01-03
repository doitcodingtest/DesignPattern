import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new CompanyB());
        //SMSInfo를 파라메터로 보내지만 새로운 B회사의 sendMessage(int telNumber, String message)를 Adapter로 사용
        adapter.sendSMS(new SMSInfo(0101231234, "B 회사를 통해 메세지를 보냅니다."));
    }
}