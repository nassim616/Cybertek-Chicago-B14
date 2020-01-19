package interviewPracticeQuestions;

import java.util.ArrayList;

public class PrimeNumber {
//    Prime Number Create a method that will accept a number (int).
//    Return an ArrayList of all the numbers that are prime numbers in the range of 1 to the given number**
//    Hint: make a helper method first, isPrimeEx:> input: 50> output: [1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47]




 public  static boolean isPrimeNumber (int number) {
        for (int i = 2; i<number; i++){
            if (number%i== 0 ) return false;


        }
          return  true;
 }

 public  static ArrayList<Integer> allPrimeInRange(int range){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2 ;i <range ;i++){
            if (isPrimeNumber(i)){
                list.add(i);
            }
        }

            return list;

 }

}
