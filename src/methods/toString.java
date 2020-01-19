package methods;

public class toString {
    public static void main(String[] args) {


//        Write a method that accepts an int array. Print out the array using the same format as Arrays.
//        toString method. DO NOT USE THE toString() METHOD.
//           [element, element, element]

        int[] arr2 = {-1, 3, -4, -2, 32, 2, -23, 1};
        ArrayToString(arr2);

    }

public static void ArrayToString( int []arr ){

        //output: [10,9,5,4,3,7,4]
        String result = "[";
        for(int num : arr) {
            result += num + ", ";
        }
        result = result.substring(0,result.length()-2) + "]";
        System.out.println(result);
    }




}



