public abstract class User {
    protected ChatSystem chatSystem;
    protected String Login;
    public User(ChatSystem chatSystem, String login) {
        this.chatSystem = chatSystem;
        Login = login;
    }
    public abstract void send(String message);
    public abstract void receive(String message);
}
