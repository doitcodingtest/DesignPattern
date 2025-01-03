public class MultiThreadMain {
    public static void main(String[] args) {
        Runnable run = () -> {
            SingletonSpeaker2 speaker = SingletonSpeaker2.getInstance();
            System.out.println(speaker.toString());
        };
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(run);
            thread.start();
        }
    }
}
