package Exceptions;

public class FinallyEx {
    public static void main(String[] args) {
        String s= "";
        try {
             s = " cybertek ";
            System.out.println(s.substring(10));
        }catch (StringIndexOutOfBoundsException e ){
            System.out.println(" index doesn't exist ");
        }finally {
            System.out.println(" the String was " + s);
        }
    }
}
