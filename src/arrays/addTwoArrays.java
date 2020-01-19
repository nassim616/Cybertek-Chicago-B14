package arrays;

import java.util.Arrays;

public class addTwoArrays {
    public static void main(String[] args) {

//        .7) Given you have two arrays with values of:
//        3,2,6,43,7,20      and
//        2,7,-10,10,-5,2
//        Write a program that adds each element and stores them into a new array. Print the final array
//

        int [] arrayOne = {3,2,6,43,7,20};
        int [] arrayTwo = {2,7,-10,10,-5,2};
        int [] sum = new int[arrayOne.length];
        for(int i = 0; i < sum.length; i++) {
            sum[i] = arrayOne[i] + arrayTwo[i];
        }
        System.out.println(Arrays.toString(sum));



    }
}
