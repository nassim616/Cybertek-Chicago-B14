package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfEvenNumber {
    public static void main(String[] args) {

//        7) Given an array with values of: 1,2,-3,4,-34,55,78,90,33,10
//        Take our all the even numbers from the array and put them into a new array. Print the new array


        Scanner input = new Scanner(System.in);
       int[] arr =  { 1,2,-3,4,-34, 55,78 ,90 ,33 ,10 };// element
       int count = 0;

       for(int i = 0 ; i < arr.length; i++ ) {

           if (arr[i] % 2 == 0) {

               count++;
           }
       }
        int [] evenNumbers = new int[count];
        for(int i=0, j=0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                evenNumbers[j] = arr[i];
                j++;


                }
                }

                    System.out.println ( Arrays.toString (evenNumbers));





    }
}
