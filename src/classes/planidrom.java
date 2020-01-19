package classes;

public class planidrom {
    public static void main(String[] args) {

    }


//
//    Palindrome is a word, phrase, or sequence that reads the same backward as forward, e.g., madam or nurses run.
//
//    So method isPalindrome checks that and returns true if check is palindrome and false if it is not.
//
//- make your conditions case insensitive.  ex: Civic and civic are both palindromes
//- make your conditions space insensitive.  Race car is a palindrome even though there is space in between.


    public static boolean isPlanidrom(String check){
        check= check.toLowerCase();

      check = check.replace(" " ,"");

      String planid = "";

      for(int i = check.length()-1 ; i>=0 ; i-- ){
          planid += check.charAt(i)+"";
      }

      if (planid.equals(check)){
          return true;
      }
      return false;

    }
}
