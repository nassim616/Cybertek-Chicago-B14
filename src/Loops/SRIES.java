package Loops;

import java.util.Scanner;

public class SRIES {
    public static void main(String[] args) {

//        Write a program to calculate the sum of following series where n is input by user.
//        1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n


        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        double sum = 0.0;
        for(int i = 1 ; i <= n ; i++){
            sum += 1/i;
            System.out.print(sum);
        }


    }
}


