package methods;

public class plandromReturn {
    public static void main(String[] args) {

//    Create a method that will take a String as a parameter and return if the String is palindrome or not


        System.out.println(isPalindromeArr("civic"));
    }

    public static boolean isPalindromeArr(String str) {

        char[] arr = str.toLowerCase().toCharArray();

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }
    }
//
//    public static boolean isPalindromeRev(String str , String Reverse) {
//        if (Reverse.reverseString(str).equals(str)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//}






