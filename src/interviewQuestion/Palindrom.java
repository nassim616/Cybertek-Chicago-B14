package interviewQuestion;

public class Palindrom {
    public static void main(String[] args) {
        numberPalinder(255);
    }
    public static void numberPalinder(int number){
        int reverse = 0;
        int number2 = number;
        while (number>0){
            int digit = number2%10;
            reverse += digit + reverse*10;
            number2 = number2 /10;
        }
        if (number==reverse){
            System.out.println("Number is palindrom");
        }else {
            System.out.println("Number is not palindrom");
        }
    }
}
