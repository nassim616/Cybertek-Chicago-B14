package methods;

public class acceptsStringAndInteger {
    public static void main(String[] args) {

//        Create a method that accepts String and int.
//                Check if string length is same as given integer.
//                Print "Equal" if they are equal. Print "Not equal" if string length and given integer are not equal.

        equalLengths("name", 4);


    }

    public static void equalLengths(String str, int len) {
        if (str.length() == len) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}




