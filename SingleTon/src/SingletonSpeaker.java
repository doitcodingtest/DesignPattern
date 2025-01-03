public class SingletonSpeaker {
    private static SingletonSpeaker instacne;
    private SingletonSpeaker() {}

    public static SingletonSpeaker getInstance() {
        if (instacne == null) {
            instacne = new SingletonSpeaker();
        }
        return instacne;
    }
}
