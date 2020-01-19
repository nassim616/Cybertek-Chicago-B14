package multiArrays;

public class forEach {
    public static void main(String[] args) {
        int [] [] numbers = {{1,2,3},{4,5,6} , {1 ,8 , 7 }};
        for (  int []  inner : numbers){
            for(int element : inner ){
                System.out.println(element);
            }
            System.out.println();

        }
    }
}
