public class Adapter implements CompanyA {
    CompanyB companyB;

    public Adapter(CompanyB companyB) {
        this.companyB = companyB;
    }

    @Override
    public void sendSMS(SMSInfo smsInfo) {
        companyB.sendMessage(smsInfo.TelNum, smsInfo.MessageData);
    }
}
