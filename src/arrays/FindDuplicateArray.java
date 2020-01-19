package arrays;

public class FindDuplicateArray {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 3, 5, 6, 7, 7, 8, 9, 10};
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            count = 0;
            for (int j = 0; j < num.length; j++) {
                if (num[j] == num[i]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.print(" " + num[i]);
            }
        }
    }
}