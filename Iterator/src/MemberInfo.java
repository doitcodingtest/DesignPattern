import java.time.LocalDate;
import java.util.*;

public class MemberInfo implements IterableCollection {
    List<User> premiumMember;

    public MemberInfo() {
        premiumMember = new ArrayList<>();
    }

    public void addPremiumMember(String name, LocalDate date) {
        this.premiumMember.add(new User(name, date));
    }

    public List<User> getPremiumMember() {
        return premiumMember;
    }

    public void setPremiumMember(List<User> premiumMember) {
        this.premiumMember = premiumMember;
    }

    @Override
    public Iterator nameIterator() {
        return new NameIterator(premiumMember);
    }

    @Override
    public Iterator dateIterator() {
        return new DateIterator(premiumMember);
    }
}
