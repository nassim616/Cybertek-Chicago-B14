package Loops;

import java.util.Scanner;

public class addNumber {
    public static void main(String[] args) {

//
//        3) Create a program that will continue to add 1 to a number if the user keeps entering “y” or “yes” Number will
//        start at 0. When the user enters “n” or “no” Print out the final number.
//                Flow:
//        Would you like to add 1?
//> y
//        Would you like to add 1?
//> y
//        Would you like to add 1?
//> y
//        Would you like to add 1?
//> n
//        Your number is: 3


        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to add 1");
        String check = input.nextLine();
        int number = 0;
        while ("yes".equals(check) || "y".equals(check)) {
            number++;
            System.out.println("Would you like to add 1");
            check = input.nextLine();
        }
        System.out.println("Your number is: " + number);
    }
}

