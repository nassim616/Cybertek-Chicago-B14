package DoWhileLoop;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Letter{
    public static void main(String[] args) {

//        5) Write a program that will ask user to enter a letter. We will work with uppercase letters only.
//                If the given information is not a letter from A to Z then print “invalid data”.
//        But if a correct letter was given print the rest of the characters up to Z.


        Scanner input = new Scanner(System.in);

       char letter = input.nextLine().toUpperCase().trim().charAt(0);
       if (letter >= 65 && letter <= 90 ){
           while (letter != 'z' +1 ){
               System.out.println(letter++);
           }
       ;
       }



    }

}
