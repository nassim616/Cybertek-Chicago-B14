package methods;

public class overloadTheString {
    public static void main(String[] args) {
//
//        Create a method that will accept two Strings. Return a new String that has the firstWord
//        then the secondWord and then the firstWord again
//> input: “day”, “name”
//> output: “daynameday”
//        Overload the method above to now accept the two Strings and an integer. The integer given tells you how many
//        times your first word should show up in your new String. Your first words need to always be separated by the second word.
//                > input: “day”, “name”, 3
//                > output: “daynamedaynameday”
//
        System.out.println(twoString("day","name"));
        System.out.println(twoString("day", "night", -3));

    }

public static String twoString ( String firstWord , String secondWord ){
        return  firstWord+secondWord + firstWord ;
}

 public static String twoString( String firstWord ,String secondWord , int times) {
     if (times <= 0) {
         return "";
     }

     String word = "";
     for (int i = 0; i < times; i++) {
         word += firstWord;
         if (i == times - 1) {
             break;
         }
         word += secondWord;
     }
     return word;
     //  return word.substring(0,word.length() - second.length());
 }
    }