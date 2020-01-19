package arrays;

import java.util.Scanner;

public class ArrayOfCars {
    public static void main(String[] args) {
//
// 0) Write a program that asks the number of cars user has and create an array of String with given size.
// Then ask the user to enter each car. After getting all the cars, print the array.
//     Flow: Enter number of cars: > 3 Enter car 1: > BMW Enter car 2: > Mercedes Enter car 3: > Toyota
//              [BMW, Mercedes, Toyota]
        Scanner input = new Scanner(System.in);
        System.out.println(" enter the number ");
        int size = input.nextInt();
        input.nextInt();


        String[] cars = new String[size];

          for (int i = 0 ; i < cars.length; i++ ){


              System.out.println( "enter car"+ (i+1));
              String myCars = input.nextLine();

            cars[i] = myCars;

        }


    }
}
