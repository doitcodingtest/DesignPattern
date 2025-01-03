public class SamsungPay implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("삼성페이로 " + amount + "원을 결제 합니다.");
    }
}
