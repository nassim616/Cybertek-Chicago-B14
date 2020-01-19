package methods;

public class Methods_palindromes {
    public static void main(String[] args) {
        System.out.println(isPlindromes("civic"));
    }

    public static boolean isPlindromes(String word) {
        String temp = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            temp += word.charAt(i);
        }
        if (!word.equalsIgnoreCase(temp)) {
            return false;
        } else {
            return true;
        }
    }
}

