package mentroringTuesday;

public class student {

    String firstName;
    String lastName;
    int age;
    boolean isActive;

public String info (){
    return  String.format("firstName = %s,\nage=s%,\nisActive=%s",firstName,lastName,age,isActive);
}
}
