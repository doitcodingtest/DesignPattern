public class SingletonSpeaker1 {
    private static SingletonSpeaker1 instacne;
    private SingletonSpeaker1() {}

    public static synchronized SingletonSpeaker1 getInstance() {
        if (instacne == null) {
            instacne = new SingletonSpeaker1();
        }
        return instacne;
    }
}
