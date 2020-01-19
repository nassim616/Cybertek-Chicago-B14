package utilities;

import java.util.ArrayList;

public class SchoolSystem {
    public static void main(String[] args) {
        ArrayList<String > k = MyCollection.getStringsList();
        System.out.println("\n " + k);
        ArrayList<String > list = new ArrayList<>();
        list.add("jason");
        list.add("john");
        list.add("hjjdhh");
        list.add("ghuyt");
        list.add("jason");
        ArrayList<String > j = MyCollection.filterList(list,5);
        System.out.println(k);
        ArrayList<String > a = MyCollection.removeDuplicates(list);
        System.out.println(a);
    }
    }