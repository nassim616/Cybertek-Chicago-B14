package arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
//        Given a String variable sentence, write code to type each word in separate lines in a reverse order.
//        Example:
//        sentence -> "Java is fun"
//        Print
//                fun
//                 is
//                Java

//        Scanner in = new Scanner(System.in);
//        String sentence = in.nextLine();
//        String [] word = sentence.split(" ");
//        for (int i = word.length -1 ; i>=0 ;i--){
//            System.out.println(word[i]);
//
//        }
//
//



//
//   Given a String array words, iterate through each word and print first and last letter of each element in separate lines.
//
//    Example:
//
//        words → ["hello", "why", "by", "apple" , "note"]
//        print:
//        ho
//                wy
//        by
//                ae
//        ne

        Scanner in = new Scanner(System.in);
       String []words = {in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine()};
       String first= "";
       String last = "";
       for(int i = 0 ; i<words.length;i++){
           first = words[i].substring(0,1);
           last = words[i].substring(words[i].length()-1);
           System.out.println(first+last);
       }
   }
}
