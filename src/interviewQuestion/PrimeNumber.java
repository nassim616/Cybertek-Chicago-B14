package interviewQuestion;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(primeNumber(45));
    }
    public static String primeNumber(int range){
        String numbers="";
        for(int i=2; i<=range;i++){
            boolean check=true;
            for(int j=2; j<i;j++){
                if(i % j ==0){
                    check=false;
                    break;
                }
            }
            if(check){
                numbers +=i +" ";
            }
        }
        return numbers;
    }
}