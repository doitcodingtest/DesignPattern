public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public String make() {
        return builder.build();
    }
}
