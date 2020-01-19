package interviewQuestion;

public class SwapTwoNumbers {
    public static void main(String[] args) {
     swapTwonumbers(2,4);
    }

    public static void swapTwonumbers(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }
}