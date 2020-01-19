package arrays;

import java.util.Arrays;

public class Brands {
    public static void main(String[] args) {

        String[] carBrand = {"mercedes", "bmw", "toyota", "ferrari"};

        for (String car : carBrand) {

        }

        String[] shows = {"game", "friends", "Prison break", "doctor who ", "Greys Anatomy"};
        Arrays.sort(shows);
        System.out.println("sorted list of shows");
        for (int i = 0; i < shows.length; i++) {
            System.out.println("#" + i + " " + shows[i]);
        }

        int[] grades = {15, 25, 33, 35, 66, 44, 78, 95, 1, 500};
//        Arrays.sort(grades);
//        System.out.println("Min value : " + grades[0]);
//        System.out.println("max value : "+ grades[grades.length-1]);
        int max = grades[0];
        int min = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (max < grades[i]) {
                max = grades[i];
            }
            if (min > grades[i]) {
                min= grades[i];
            }
        }
        System.out.println("min " + min);
        System.out.println("max " + max);
    }
}