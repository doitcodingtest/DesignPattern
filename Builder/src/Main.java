public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder("하루코딩").age(39).address("대한민국").build();
        System.out.println(person);
        Person person2 = new Person.Builder("하루코딩").address("대한민국").age(39).build();
        System.out.println(person2);
        Person person3 = new Person.Builder("Kei").age(20).build();
        System.out.println(person3);
    }
}