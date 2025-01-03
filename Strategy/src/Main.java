public class Main {
    public static void main(String[] args) {
        DeliveryApp deliveryApp = new DeliveryApp();
        deliveryApp.setPayment(new CreditCard());
        deliveryApp.pay(5000);
        deliveryApp.setPayment(new SamsungPay());
        deliveryApp.pay(3000);
        deliveryApp.setPayment(new KakaoPay());
        deliveryApp.pay(7000);
    }
}