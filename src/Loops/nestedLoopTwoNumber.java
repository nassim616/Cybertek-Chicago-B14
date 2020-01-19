package Loops;

import java.util.Scanner;

public class nestedLoopTwoNumber {
    public static void main(String[] args) {

//
//           ) Write a program that will ask the user to enter two numbers. The first number will be the starting value for your range.
//           The second number will be the ending number of your range. Add up the sum of all the numbers in your range and print
//“The some of num1 to num2 is: sumAllValue”
//> input: 1, 100
//                > output: “The some of 1 to 100 is: 5050”
//
//
//
//        Part 2:
//        For the same range also print the average of the numbers.
//                Print: “The average is: avgNumber“
//> The average is: 50.5

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int numOne = input.nextInt();
        int numTwo = input.nextInt();
        int sum = 0;

        for(int i = numOne; i <= numTwo; i++) {
            sum += i;
        }
        System.out.println("The sum of " + numOne + " to " + numTwo + " is " + sum);

    }
}




