package Exceptions;

import java.util.Scanner;

public class AgeTask {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name ");
        String name = input.nextLine();
        int age;

        try {
            System.out.println(" enter your age ");
            age = input.nextInt();
        } catch (Exception e){
            System.out.println(" invalid age entered ");
            System.out.println(e.toString());
        }

    }
}
