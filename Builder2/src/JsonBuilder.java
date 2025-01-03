public class JsonBuilder implements Builder {
    private final Person person;

    public JsonBuilder(Person person) {
        this.person = person;
    }

    @Override
    public String build() {
        String sb = "{\n" +
                "\t\"Name\" : " +
                "\"" + person.getName() + "\",\n" +
                "\t\"Age\" : " +
                person.getAge() + "\n" +
                "}";
        return sb;
    }
}
