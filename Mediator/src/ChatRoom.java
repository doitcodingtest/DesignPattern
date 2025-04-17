import java.util.ArrayList;
import java.util.List;
public class ChatRoom implements ChatSystem {
    private final List<User> roomMember; // 사용자들이 멤버 변수로 관리
    public ChatRoom() {
        roomMember = new ArrayList<>();
    }
    @Override
    public void joinUser(User user) {
        roomMember.add(user);
    }
    @Override
    public void leaveUser(User user) {
        roomMember.remove(user);
    }
    @Override
    public void sendMessage(String message, User user) {
        for (User u : roomMember) {
            if (u != user) { // 발신자만 제외하고 전달
                u.receive(message);
            }
        }
    }
}
