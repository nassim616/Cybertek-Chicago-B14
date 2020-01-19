package methods;

public class weekendReturns {
    public static void main(String[] args) {

//        Write a method that will tell you if it is the weekday or not.
//        The method takes a String, Saturday and Sunday are the only weekend days

        System.out.println(isWeekDay("sat" ));

    }

    public static boolean isWeekDay(String day  ){

       day = day.toLowerCase();
       switch (day){
           case "monday":
           case "tuesday":
           case "wednesday":
           case "thursday":
           case   "friday":

           return true;
           case "saturday":
           case "sunday":
           return false;
           default:
               System.out.println("invalid day provided ");
               return false;
       }


    }


}
