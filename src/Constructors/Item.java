package Constructors;

public class Item { // class

   public String name;
   public double prices;
    int item ;
    public Item(String name , double prices) { // constructor
        this.name = name;
        this.prices = prices;


        // over load the constructor that takes 3 parameters to set all 3 instance variables
    }
    public Item( String name , double price , int size){
        this.name= name;                                       //constructor
        this.prices = price;
        this.item = size;

        // we can call constructor inside another constructor
        // it is called constructor chaining .
        //we can do it using keyword ' this ' with the parenthesis
    }

    public void info(){   // method
        System.out.println("the name " +name);
        System.out.println("the prices " +prices);


    }

}
