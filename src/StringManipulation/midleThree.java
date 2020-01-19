package StringManipulation;

import java.util.Scanner;

public class midleThree {
    public static void main(String[] args) {
//
//        Ask user to enter a word. If the word has odd number of characters and has 5 or more characters,
//                print the middle three characters of the word.
//
//                Input:
//        fifteen
//
//        Output:
//        fte

        System.out.println("Please enter word:");
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.nextLine();

        // Your code here
        //------------------------------------------------
        if (n1.length()% 2 == 1 && n1.length() >= 5 ){

            System.out.print(n1.substring(n1.length()/2-1, n1.length()/2+2));

        }

    }
}




