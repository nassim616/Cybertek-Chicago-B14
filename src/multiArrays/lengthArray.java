package multiArrays;

public class lengthArray {
    public static void main(String[] args) {
//        Create a 2D int array that has 3 inner arrays with some initial values. Print out the length of each inner array.
//> Given int array of [[4,2,3], [3232,11,13, 4, 2], [23,13]]
//        Length of row 1: 3
//        Length of row 2: 5
//        Length of row 3: 2
//
        int arr [][] = {{4,2,3},{3232,11,13,4,2},{23,13}};
        System.out.println("Length of row 1 " + arr[0].length);
        System.out.println(" Length of row 2 " + arr [1].length);
        System.out.println(" Length of row 3 " + arr [2].length);
    }
}
