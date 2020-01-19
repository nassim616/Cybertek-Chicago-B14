package polymorphism;

public class Person {
    private String name;
 public Person(String name){

    }
    public void info(){
        System.out.println("Name : " + this.name);
    }
    public boolean hasSameNAme(Person otherPerson){
        return this.getName().equalsIgnoreCase(otherPerson.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
