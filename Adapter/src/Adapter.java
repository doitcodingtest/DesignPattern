public class Adapter extends Adaptee implements ClientInterface {
    @Override
    public void method(String data) {
        int specialData = convertToAdapteeFormat(data);
        serviceMethod(specialData);
    }

    private int convertToAdapteeFormat(String data) {
        return Integer.parseInt(data);
    }
}


