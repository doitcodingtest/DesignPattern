import java.time.LocalDate;

public class User {
    String name;
    LocalDate joinDate;

    public User(String name, LocalDate joinDate) {
        this.name = name;
        this.joinDate = joinDate;
    }
}
