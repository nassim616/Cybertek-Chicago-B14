package stringBuilder;

public class deleteWord {
//
//    Create a method deleteWord. The method will take a String and check if “con” is in the String.
//    If it is in the String remove it from the String. Return the String with any changes.
//    Overload the deleteWord method to take two Strings. The first String is the main String and the second String is the String we are looking for.
//    Before this second String was always “con”, but now it will be more dynamic.
//    If the String we are looking for is found in the main String, then remove that part. Return the String with any changes.

    public static void main(String[] args) {
        System.out.println(deleteWord("this has con in the middle and con "));

    }
    public static String deleteWord(String word){
        StringBuilder sb = new StringBuilder(word);
        int index = sb.indexOf("con");
        if (index >=0){
            sb.delete(index,index+3);
        }
      return  sb.toString();
    }
    public static String deleteWord(String word, String target) {
        StringBuilder sb = new StringBuilder(word);
        int index = sb.indexOf(target);
        if(index >= 0) {
            sb.delete(index,index+ target.length());
        }
        return sb.toString();
    }
}
