package methods;


import java.util.Arrays;

public class biggestAndSmallestReturn {
    public static void main(String[] args) {

//        Given a String of numbers. Return the difference between the biggest and smallest number
        System.out.println(differenceNumbers("9323234"));
    }

   public static int differenceNumbers (String number){
        String[] arr = number.split("");
        Arrays.sort(arr);
       return Integer.valueOf(arr[arr.length-1]) - Integer.valueOf(arr[0]);




   }


}
