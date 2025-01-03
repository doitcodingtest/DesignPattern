import java.util.Collections;
import java.util.List;

public class NameIterator implements Iterator {

    int currentPosition = 0;
    private final MemberInfo memberInfo;

    public NameIterator(List<User> userList) {
        memberInfo = new MemberInfo();
        Collections.sort(userList, (o1, o2) -> o1.name.compareTo(o2.name));
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
