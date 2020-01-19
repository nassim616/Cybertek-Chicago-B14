package ifEleseStatement;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {

//        User is asked to enter their name.
//                You will check if it is a cool name.> If the name begins
//        with an ‘a’ or a ‘z’ print “Your name is cool”> Otherwise print “Sorry not a cool name

        Scanner input = new Scanner(System.in);
        System.out.println(" enter your name ");
        String name = input.nextLine();
        boolean check = name.startsWith("a") || name.startsWith("z");
      if(check) {
          System.out.println(" your name is cool");
      }else
          System.out.println("sorry not a cool name");
      }

    }

