package staticCLASS;

public class BestBuy {

    String location;
    static int numOfcumputers;
    static   String day;
    static {

   numOfcumputers = 50;
    System.out.println("run first");
}
static {
    System.out.println("run 2nd");
    if(day.equals("monday")){         // static block
        numOfcumputers = 60;

    }else{
        numOfcumputers=20;
    }
}


   public static void printComputer(){
       System.out.println(numOfcumputers);

   }

}
