package methods;

import java.util.Scanner;

public class countWords {
    public static void main(String[] args) {



//    Create a void method name countWords that will accept a String as an argument. Print the following:
//            “The number of words in the sentence is: numberOfWords”

        Scanner input = new Scanner(System.in);

        System.out.println("enter some string");
        String str = input.nextLine();
         countWords(str);

}

public static void countWords(String str){
        String[] arr = str.trim().split("");
    System.out.println("the number of words in the sentence is " + arr.length);


    }
}