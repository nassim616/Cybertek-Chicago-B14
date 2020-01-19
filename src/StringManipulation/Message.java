package StringManipulation;

import java.util.Scanner;

public class Message {
    public static void main(String[] args) {

//
//        User is asked to enter a message to send.
//                You will check if the message contains any of these bad words:
//        “idiot, dumb, stupid”> if any bad words are in the message change
//        them to “smart” and print “your message was changed:” and then print the new message in the next line.>
//        if the message had no bad words print “Your message was not changed:” and then print the original message in the next line.
//
        Scanner input = new Scanner(System.in);
        String message = input.nextLine();
        String checked = message;
         checked = checked.replace("idiot", "smart");
        checked = checked.replace("dumb", "smart");
        checked = checked.replace("stupid", "smart");
        if (message.equalsIgnoreCase(checked)){
            System.out.println("");
        }
    }
}
