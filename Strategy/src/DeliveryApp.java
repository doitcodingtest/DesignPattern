public class DeliveryApp {
    Payment payment; // 구체적인 클래스가 아닌 추상화된 인터페이스를 가지고 있습니다.

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void pay(int amount) {
        this.payment.pay(amount);
    }
}
