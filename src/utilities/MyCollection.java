package utilities;

import java.util.ArrayList;
import java.util.Scanner;

public class MyCollection {

//
//    Create a package utilities Create a class MyCollectionCreate a static method called getStringListThis method will keep asking
//    used to enter Strings until they are done. Take all the Strings they give and put them into an
//    ArrayList. Return the ArrayList after the user has entered all the information they wanted.
//        Flow:Please enter your String:> Chair Do you want to enter more? Y/N> YPlease enter your String:>
//    HatDo you want to enter more? Y/N> N—> Returns ArrayList including: Chair and Hat——————————————————————Create a static method getIntegerList.
//    This method does the same as getStringList, but it accept numbers instead of Strings from the user——————————————————————Create a static method filterList.
//    This method accepts a String array list and a number. The method will go through each element from the array list and create a new array list with Strings that have the same length
//    as the number given in the parameters ——————————————————————Create a static method removeDuplicates.This method accepts a String array list and removes any duplicate elements.
//    The method will return an array list with only unique values ——

    /**
     * this method creates list of string
     *
     * @return
     */
    public static ArrayList<String> getStringsList() {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter word");
            words.add(scanner.nextLine());
            System.out.println("Are you done y/n ?");
            if (scanner.nextLine().equals("y")) {
                break;
            }
        }
        return words;
    }

    public static ArrayList<String> filterList(ArrayList<String> words, int size) {
        ArrayList<String> newWords = new ArrayList<>();
        for (String s : words) {
            if (s.length() == size) {
                newWords.add(s);
            }
        }
        return newWords;
    }

    public static ArrayList<String> removeDuplicates(ArrayList<String> words) {
        ArrayList<String> newWords = new ArrayList<>();
        for (String s : words) {
            if (newWords.contains(s)) {
                continue;
            }
        }
        return newWords;
    }
}
