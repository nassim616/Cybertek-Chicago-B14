package methods;

public class beFibonacci {
    public static void main(String[] args) {

    theFibonacci(7);

    }
    public static void theFibonacci(int n){
       int num1 = 0;
       int num2 = 1;
       System.out.print("the first " + n + "number of fibonacci series are : ");
       for ( int i = 0 ; i <=n;i++){
            System.out.print(num1 + "  ");
            int sum = num1 + num2;
            num1 = num2;
            num2= sum;

        }
    }
}
