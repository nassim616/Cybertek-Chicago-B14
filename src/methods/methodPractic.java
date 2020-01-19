package methods;

public class methodPractic {
    public static void main(String[] args) {

    sayHello();
     oddNumber();
    }


    public static void sayHello(){
       for (int i = 0 ; i<= 50 ; i++){
            System.out.println("hello" + (i+1));
        }
    }
    public static void oddNumber (){
        for ( int i = 1 ; i<=100 ; i++){
            if(i%2 == 1){
                System.out.println(i);
            }
        }

    }
}
