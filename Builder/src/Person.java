public class Person {
    private final String name;
    private final int age;
    private final String address;

    public Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address; //필수 항목은 final로 선언하여 생성자 함수에서 받도록 유도한다
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder {
        private final String name;
        private int age;
        private String address;

        public Builder(String name) {
            this.name = name;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() { // build 함수에서  현재 데이터를 이용하여 Person 객체를 생성하고  리턴
            return new Person(this);
        }
    }
}
