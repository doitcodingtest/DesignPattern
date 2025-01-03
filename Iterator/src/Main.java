import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        MemberInfo memberInfo = new MemberInfo();
        memberInfo.addPremiumMember("박축구", LocalDate.of(2022, 7, 17));
        memberInfo.addPremiumMember("김한국", LocalDate.of(2024, 8, 12));
        memberInfo.addPremiumMember("하루코딩", LocalDate.of(2024, 5, 5));

        System.out.println("\n가입일 순 Iterator 사용");
        Iterator iterator = memberInfo.dateIterator();
        while (iterator.hasNext()) {
            User user = (User) iterator.next();
            System.out.println("가입일: " + user.joinDate + "\t" + "이름: " + user.name);
        }
        System.out.println("\n이름 순 Iterator 사용");
        iterator = memberInfo.nameIterator();
        while (iterator.hasNext()) {
            User user = (User) iterator.next();
            System.out.println("가입일: " + user.joinDate + "\t" + "이름: " + user.name);
        }
    }
}