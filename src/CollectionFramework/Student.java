package CollectionFramework;

public class Student {
    String name;
    public Student(String name){
        this.name= name;
    }
    public String toString (){
        return String.format("Student name is %s , tis.name ");

    }
    public static void main (String []args){
        Student s = new Student("john");
        Student s2 = new Student("john");
    }
}
