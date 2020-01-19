package methods;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {

        String w1 = "listen";
        String w2 = "silent";
        System.out.println(isAnagram(w1,w2));
    }

    public static boolean isAnagram(String word1, String word2) {
        if (word1.length() == word2.length()) {
            word1 = word1.toLowerCase();
            word2 = word2.toLowerCase();
            String[] arr_word1 = word1.split("");
            String[] arr_word2 = word2.split("");
            Arrays.sort(arr_word1);
            Arrays.sort(arr_word2);
            if (Arrays.equals(arr_word1, arr_word2)) {
                return true;
            }
            return false;
        }
        else {


       return false;
    }
}
}
