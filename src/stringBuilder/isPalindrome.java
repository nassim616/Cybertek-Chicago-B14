package stringBuilder;

public class isPalindrome {

//    Create a static method isPalindrome. Method takes a String and check if the String is palindrome or not.
//    Return true if it is palindrome and false if it is not. Use StringBuilder




    public static void main(String[] args) {
        System.out.println(ispalindrome("civic"));

    }
    public static boolean ispalindrome (String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if (str.equals(sb.toString())){
            return true;
        }else{
            return false;
        }
    }

}
