public class KakaoPay implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("카카오페이로 " + amount + "원을 결제 합니다.");
    }
}
