package methods;

public class largestSecondNumber {
    public static void main(String[] args) {
   int [] arr = {12, 23, 3, 5, 89};
        System.out.println(secondlargestNumber(arr));
    }
    public static int secondlargestNumber(int [] arr){
        int max= arr[0];
        for (int i = 0 ; i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i]; // 89
            }
        }
           int diff = max;
        for(int j = 0 ; j<arr.length;j++){
            if (max-arr[j]<diff && arr[j]!=max){
                diff = max-arr[j];
            }
        }
        int seconde_largest = max-diff;
        return seconde_largest;
    }
}
