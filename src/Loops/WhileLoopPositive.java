package Loops;

import java.util.Scanner;

public class WhileLoopPositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0 ;
        System.out.println(" enter positive number");
        int nextNumber = input.nextInt();
        while (nextNumber >0 ){
            total = total+ nextNumber;
            nextNumber = input.nextInt();

        }
        System.out.println( " sum of all numbers " + total);

    }
}
