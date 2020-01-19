package Loops;

import java.util.Arrays;

public class zambie1 {
    public static void main(String[] args) {

        int[] array_zero = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] populations = {3, 6, 0, 4, 3, 2, 7, 1};
        int days = 0;
        while (!Arrays.equals(populations, array_zero)) {
            System.out.println("Day " + days + " " + Arrays.toString(populations));
            for (int j = 0; j < populations.length; j++) {
                populations[j] = populations[j] / 2;
            }
            days++;
        }
        System.out.println("Day " + days + " " + Arrays.toString(populations));

    }
}
//
//
//      int [] array_zero = {0,0,0,0,0,0,0,0};
//      int [] population = {3,6,0,4,3,2,7,1 };
//      int day = 0;





