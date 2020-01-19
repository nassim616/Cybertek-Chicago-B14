package Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {



        Scanner input  = new Scanner(System.in);


        int x = input.nextInt();

        int fibonacci1 = 0;
        //int b=0;
        int fibonacci2 = 1;
        for (int i = 1; i <= x ; i++) {
            System.out.print(fibonacci1 + " " );
            int sum = fibonacci1 + fibonacci2;

            fibonacci1 = fibonacci2;
            fibonacci2 = sum;
      }
   }
 }