package methods;

public class ReverseStringReturn {

    public static void main(String[] args) {

//        Create a method that will accept a String and will reverse your String. Return the reversed String.

        System.out.println(reverseString("java is fun"));
    }

    public static String reverseString(String str) {
        String reverse = "";

        for(int i= str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }
}