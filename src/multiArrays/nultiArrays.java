package multiArrays;

import java.util.Arrays;

public class nultiArrays {
    public static void main(String[] args) {
//
//        String [] [] str = new String[4][];
//        System.out.println(Arrays.deepToString(str));
//

        int [] [] numbers = {{1,2,3},{4,5,6} , {1 ,8 , 7 }};


       System.out.println(Arrays.toString(numbers [0]));
        System.out.println(numbers[1].length);
        for ( int i = 0 ; i < numbers.length;i++){
            for (int j = 0 ; j < numbers[i].length ; j++){
                System.out.println(numbers[i] [j]) ;
            }
            System.out.println();
        }
    }
}
