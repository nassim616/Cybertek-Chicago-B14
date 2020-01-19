package StringManipulation;

import java.util.Scanner;

public class October {
    public static void main(String[] args) {

//
//        2) You have a value that hold what month it is (October). Ask the user to enter the month from the console.
//                If the user’s input matches the expected month put print true, but if the input does not match the actual month print false.
//            Uppercase and lowercase letters do not matter, we only care about the value.


                Scanner input = new Scanner(System.in);
               String month = "october";
        System.out.println("enter the month");
                String user = input.nextLine();

               boolean check = user.equalsIgnoreCase(month);
        System.out.println(check);
    }
}
