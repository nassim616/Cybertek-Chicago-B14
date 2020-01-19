package methods;

import java.util.Arrays;

public class AgramWithToCharArray {
    public static void main(String[] args) {
//        String str1 = "lesten";
//        String Str2 = "akjgiag";
//
        System.out.println(isAnagram(" nassim " , " asbxhbasxh "));
    }

    public static boolean isAnagram(String str1 , String str2 ){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }

}
