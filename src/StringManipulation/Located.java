package StringManipulation;

import java.util.Scanner;

public class Located {
    public static void main(String[] args) {

//        1) You have a String with the following value:
//    -> “Cybertek is located in Des Plaines”
//        The user is asked to enter a part of the string they are looking for. Find the position of the String the user is looking for and print it.
//                Ex:
//> Input: “located”
//> Output: 12
//


        Scanner input = new Scanner(System.in);
        String sentence = " cybertek is located in des plains ";
        String looking = input.nextLine();
        int loc = sentence.indexOf(looking);
        System.out.println(loc);
    }
}
