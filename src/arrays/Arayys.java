package arrays;

public class Arayys {
    public static void main(String[] args) {


//        5) Write a program that will ask user to enter 5 names. Take each name and store all the names into an array.
//////                Print the array.
//

//        Scanner input = new Scanner(System.in);
//        int size = input.nextInt();
//        input.nextLine();
//        String [] name =  new String[size];
//        for(int i = 0 ; i < name.length ; i++){
//            System.out.println("enter number " + (i+1));
//            name[i] = input.nextLine();
//        }
//        System.out.println(Arrays.toString(name));


//        Given numbers of 3,30,14,6,50,20
//        Find and print the biggest number

        int [] numbers = {3,30,14,6,50,20};
        int  max  = numbers[0];
        for(int i = 0 ; i<numbers.length ; i++){
            if (numbers[i] > max ){
                max = numbers[i];
            }
        }
        System.out.println(max);

    }
}
