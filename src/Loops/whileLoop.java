package Loops;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int use = input.nextInt();
        System.out.println(" enter a number above 0 ");
        int start = 0 ;

        while ( start <= use){
            System.out.println(start++);

        }
    }
}
