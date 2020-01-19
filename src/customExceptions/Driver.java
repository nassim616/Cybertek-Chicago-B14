package customExceptions;

public class Driver {


//               Create a class Driver.
//        Add instance variables: name, age, location
//        Encapsulate them and provide public getters and setters.
//                Throw an Exception type in setName method if entered name is consist of 2 or more words.

    private String name ;
  private int age ;
   private String location ;

    public void setName(String name) throws Exception {
        if(name.trim().contains(" ")){
            throw new Exception(name + " was invalid ");
        }
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;



            }
        }



