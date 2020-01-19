package accessModifier;

public class Storage {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.model = "IKEA";


       Person person = new Person();
        person.setName("Zeynep");
        System.out.println(person.getName());
        person.setAge(-59);
        System.out.println(person.getAge());
    }
}
