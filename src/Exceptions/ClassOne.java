package Exceptions;

public class ClassOne {
    public static void main(String[] args) {
        try {


            String s = "hello";
            System.out.println(s.charAt(30));
            System.out.println(3/0);
        }catch (Exception e){
            System.out.println(" Exception is thrown ");
        }

    }
}
