package Exceptions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

//        Create an array with values {1,2,3,4,5}
//        Ask user to enter the index they want to change, and then the number they want to change that element to.
//        Case: User could enter an index that doesnt exist
//        Case: User could enter a character instead of the index they want to change or a character instead of the number they want to change it to



      int arr [] = {1,2,3,4,5};
      Scanner input = new Scanner(System.in );
      try {
          System.out.println(" Enter the index you want to change ");
          int index = input.nextInt();
          input.nextLine();
          System.out.println("Enter the number you to add");
          int number = input.nextInt();
      }catch (InputMismatchException e){
          System.out.println(" invalid number entered ");
      }catch (ArrayIndexOutOfBoundsException e){
          System.out.println("Entered an invalid index ");
      }finally {
          System.out.println(Arrays.toString(arr));
      }
    }
}
