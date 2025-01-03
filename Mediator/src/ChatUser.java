public class ChatUser extends User {
    public ChatUser(ChatSystem chatSystem, String login) {
        super(chatSystem, login);
    }
    @Override
    public void send(String message) {
        System.out.println(this.Login + ": Send Message: " + message);
        chatSystem.sendMessage(message, this); // 발신일 경우 중재자에게 전송
    }
    @Override
    public void receive(String message) {
        System.out.println(this.Login + ": Receive Message: " + message);
    }
}
