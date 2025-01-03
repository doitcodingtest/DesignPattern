public interface ChatSystem {
    void joinUser(User user);
    void leaveUser(User user);
    void sendMessage(String message, User user);
}
