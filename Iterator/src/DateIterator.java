import java.util.Collections;
import java.util.List;

public class DateIterator implements Iterator {

    int currentPosition = 0;
    private final MemberInfo memberInfo;

    public DateIterator(List<User> userList) {
        memberInfo = new MemberInfo();
        Collections.sort(userList, (o1, o2) -> o1.joinDate.compareTo(o2.joinDate));
        memberInfo.setPremiumMember(userList);
    }

    @Override
    public boolean hasNext() {
        return currentPosition < memberInfo.getPremiumMember().size();
    }

    @Override
    public User next() {
        if (hasNext()) {
            return memberInfo.getPremiumMember().get(currentPosition++);
        }
        return null;
    }
}
