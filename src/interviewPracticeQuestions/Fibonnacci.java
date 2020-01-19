package interviewPracticeQuestions;

public class Fibonnacci {

    //    Fibonacci Create a method that will accept a number (int). Return a String with each Fibonacci number separated by a space.
//    The amount of Fibonacci numbers in the String is determined by the given numberEx: > input: 10 > output: 0 1 1 2 3 5 8 13 21 34___
//    ________
    public static void main(String[] args) {

        System.out.println(findFibonnacci(10));
    }

    public static String findFibonnacci(int num) {
        int num1 = 0;
        int num2 = 1;

        String a = num1 + " " + num2;
        for (int i = 0; i < num; i++) {
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            a += " " + sum;
        }

        return a;
    }
}

//
//    int [] arr = new int[range];
//        arr[0] = 0;
//                arr[1] = 1;
//                for(int i = 2; i < arr.length; i++) {
//        arr[i] = arr[i-1] + arr[i-2];
//        }
//        String str = Arrays.toString(arr);
//        return str.substring(1,str.length()-1).replace(",","");
//       }