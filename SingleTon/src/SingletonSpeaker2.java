public class SingletonSpeaker2 {
    private SingletonSpeaker2() {}
    private static class SingleInstanceHolder {
        private static final SingletonSpeaker2 INSTANCE  = new SingletonSpeaker2();
    }
    public static synchronized SingletonSpeaker2 getInstance() {
        return SingleInstanceHolder.INSTANCE;
    }
}
