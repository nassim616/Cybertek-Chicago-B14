package methods;

import java.util.Arrays;
import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {

       countWords();
    }
    public static void countWords(){
        System.out.println("pleae enter a sentence to be analyyzed ; ");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
       String [] words = sentence.split("");
        System.out.println("words in this array as followed : "+ Arrays.toString(words) );
        System.out.println("Number of words in this sentence are: " + words.length);



    }




}
