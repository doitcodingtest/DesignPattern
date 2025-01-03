public class SMSInfo {
    int TelNum;
    String MessageData;

    public SMSInfo(int telNum, String messageData) {
        TelNum = telNum;
        MessageData = messageData;
    }

    public int getTelNum() {
        return TelNum;
    }
}
