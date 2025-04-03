public class Main {
    public static void main(String[] args) {
        ChatSystem chatRoom1 = new ChatRoom();
        User user1 = new ChatUser(chatRoom1, "하루코딩");
        User user2 = new ChatUser(chatRoom1, "구독자 A");
        User user3 = new ChatUser(chatRoom1, "김하루");
        User user4 = new ChatUser(chatRoom1, "구독자 B");
        chatRoom1.joinUser(user1);
        chatRoom1.joinUser(user2);
        chatRoom1.joinUser(user3);
        chatRoom1.joinUser(user4);

        user1.send("중재자 패턴은 어떠신가요?");
        System.out.println("---------------------------------------");
        user3.send("편리한 점이 많은 것 같아요!");
        System.out.println("---------------------------------------");
        chatRoom1.leaveUser(user1);
        user4.send("하루코딩 어디갔지?");
        System.out.println("---------------------------------------");
    }
}