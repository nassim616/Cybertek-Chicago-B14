package FinalAndMemory;

public class Bag {
 final    String color;
  final   int size  ;


  public Bag() {
      this.color = " red ";
      size = 4 ;
  }

   public Bag (String color){
      this.color = color;
      size = 2;
   }






    // final instance variable must be initialized
    // once it is initialized then value for the color connot be changed
    // option 1 : initialize it right a way . give a value when declaring the instance variable
    // option 2 : initialize it within the constructor , because instance variables cannot be used without creating an object . if we use constructor
    // to initialize the Final instance variable ,it allows .
    // option 3 : instance initializer block . it is used to initialize instance variable .
    // it is same as static block but it's for non-static variables.
   // instance initializer block gets executed right before constructor .
    // why to use initializer block?
    // - we could be runnig few different codes to bring a value to initialize
    // in initializer block we can write any code . but we cant write any cose at instance level .
}
