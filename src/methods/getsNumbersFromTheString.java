package methods;

import java.util.Arrays;

public class getsNumbersFromTheString {
    public static void main(String[] args) {



    String str1 = "sr%igdyug6ady34";

        System.out.println(Arrays.toString(extractNumber(str1)));

}
  public static int [] extractNumber(String  str) {
      String numbers = "";// we gonna put only numbers there
      for (int i = 0; i < str.length(); i++) {
          if (Character.isDigit(str.charAt(i))) {
              numbers = numbers + str.charAt(i);

          }
      }
      String[] arr_str_unmbers = numbers.split("");
      int[] arr_numbers = new int[arr_str_unmbers.length];
      for (int j = 0; j < arr_str_unmbers.length; j++) {
          arr_numbers[j] = Integer.valueOf(arr_numbers[j]);

      }
      return arr_numbers;
  }
}