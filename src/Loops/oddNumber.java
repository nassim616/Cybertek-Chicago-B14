package Loops;

public class oddNumber {
    public static void main(String[] args) {

//        Write for and while loops so that they go through the odd integers (from 1 to 19),
//                keeping track of the sum of these integers at each stage, and printing the sum at each stage.
//
//        Expected Output:  1 4 9 16 25 36 49 64 81 100

       int sum = 0;

        for(int i = 1 ; i <= 19; i++ ){


            while ( i%2==1 ){
                sum += i;

                System.out.print(sum + " ");

                break;

            }

        }

    }
}
