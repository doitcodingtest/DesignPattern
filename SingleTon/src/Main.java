public class Main {
    public static void main(String[] args) {
        SingletonSpeaker singletonSpeaker = SingletonSpeaker.getInstance();
        System.out.println(singletonSpeaker.toString());
        SingletonSpeaker singletonSpeaker2 = SingletonSpeaker.getInstance();
        System.out.println(singletonSpeaker2.toString());
    }
}