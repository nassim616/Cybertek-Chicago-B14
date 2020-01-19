package multiArrays;

public class twoDArrays {
    public static void main(String[] args) {
        int first_arr [][] = {{35,12,99,9},{87 ,76,98}};

        int second_arr [] [] = {{67,34,13}, {98},{86,14,34}};

        System.out.println("this ia my first array");
        display(first_arr);
        display(second_arr);
    }

    public static void display(int x [] []){

        for ( int i = 0 ; i< x.length ; i++){

            for ( int j = 0 ; j< x[i].length ; j++){

                System.out.print(x[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
