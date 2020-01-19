package stringBuilder;

import java.util.ArrayList;

public class insertWord {


//        Create a method insertWord. The method will take an ArrayList of Strings. Go through each word of your ArrayList and any element
//        that has an even number of characters will be changed to have “hello” in the middle of the String. Return the changed ArrayList.

//        Overload the insertWord method to take two Strings. The first String will be the main String and the second String will
//        be the word inserted in the middle of all even numbered Strings. Return the changed ArrayList.

    public static void main(String[] args) {


       

    }

    public static ArrayList<String> insertWord(ArrayList<String> list) {
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() % 2 == 0) {
                StringBuilder sb = new StringBuilder(list.get(i));
                sb.insert(list.get(i).length() / 2, "hello");
                list.set(i, sb.toString());
            }
        }
        return list;


    }

    public static ArrayList<String> insertWord(ArrayList<String> list, String target) {
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() % 2 == 0) {
                StringBuilder sb = new StringBuilder(list.get(i));
                sb.insert(list.get(i).length() / 2, target);
                list.set(i, sb.toString());
            }
        }
        return list;

    }
}