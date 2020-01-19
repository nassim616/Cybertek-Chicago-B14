package staticCLASS;

public class Lexus {

//    Create a class Lexus
//Instance variables: model, year, color, mileage, new or not (boolean), price
//    Static variables: totalNumOfLexus
//    Create a constructor that will take the model and year of the car and set those values for the instance variables.
//    Increment totalLexes by one every time a new object is created.
//    Create a static method mileToKm. The method will convert miles to kilometers. The method will accept miles (double) and return kilometers (double)
//-> 1 mile = 1.6 km

//    Create a static method evaluateCar. This method will accept a Lexus object.
//    The method will print “Best choice” if the Lexus has less than 50 thousands miles and is less than 3 years old.
//    The method will print “Fair choice” if the Lexus has between 50 and 100 thousand miles and 3 to 7 years old.
//    The method will print “You decide” if the has has 100-200 miles.
//    The method will print “Stay away” if the Lexus has more than 200 thousand miles
//    Otherwise print “Not able to evaluate”

  String model ;
  int year ;
  double mileage ;
  boolean newOrNot;
  double price;
  static int totalNumOfLexus;
  public  Lexus(String model, int year) {
      this.model = model;
      this.year = year;
      totalNumOfLexus++;
  }
  public static double milesToKm(double miles){
      return miles * 1.6;
  }
  public static void evaluateCar(Lexus car){
      int age = 2019-car.year;
      if (car.mileage < 50000 && age <=3 ){
          System.out.println("best Choise");
      } else if (car.mileage>=50000 && car.mileage<100000 && age >= 3 && age <7 ){
          System.out.println(" fair Choise");

      }else if (car.mileage >= 100000&& car.mileage <200000){
          System.out.println(" you decide ");
      }else if (car.mileage>=200000){
          System.out.println("stay away");
      }else{
          System.out.println("not able to evaluate ");
      }

  }
}
