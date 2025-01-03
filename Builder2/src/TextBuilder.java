public class TextBuilder implements Builder {
    private final Person person;

    public TextBuilder(Person person) {
        this.person = person;
    }

    @Override
    public String build() {
        String sb = "Name: " +
                person.getName() +
                ", Age: " +
                person.getAge();
        return sb;
    }
}
