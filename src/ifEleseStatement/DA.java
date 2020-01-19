package ifEleseStatement;

import java.util.Scanner;

public class DA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int remainder = n%3;
        // Your code here
        //----------------------------------------------

        if(remainder==0){

            System.out.println("cool");}
        else {
            System.out.println("not cool");
        }
    }
}


