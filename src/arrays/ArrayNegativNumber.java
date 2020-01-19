package arrays;

import java.util.Arrays;

public class ArrayNegativNumber {
    public static void main(String[] args) {

//

        int[] num = {4, -2, 5, -3, -20, 30};
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
               // num[i] = 0;

            }
        }

        System.out.println(Arrays.toString(num));
    }
}