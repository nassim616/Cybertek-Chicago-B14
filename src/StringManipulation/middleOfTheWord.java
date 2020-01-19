package StringManipulation;

import java.util.Scanner;

public class middleOfTheWord {
    public static void main(String[] args) {

//        Ask user to enter a word. If the word has odd number of characters and has 3 or more characters,
//                print the character in the middle of the word.
//        Input:
//        eight
//
//        Output:
//        g

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter word:");
        String n1 = input.nextLine();
        if (n1.length()%2==1 && n1.length()>=3){
            int middle = n1.length()/2;
            System.out.println (n1.charAt(n1.length()/2));
        }

    }
}
