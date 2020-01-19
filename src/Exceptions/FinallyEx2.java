package Exceptions;

public class FinallyEx2 {
    public static void main(String[] args) {
        try {
            System.out.println(3/0);
            System.out.println(new int [] {2,3} [6]);

        } catch (ArithmeticException e){
            System.out.println("dont divide by 0 ");
        }finally {
            System.out.println("Java is alomst done ");
        }
    }
}
