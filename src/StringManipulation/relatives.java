package StringManipulation;

import java.util.Scanner;

public class relatives {
    public static void main(String[] args) {

//        User will be asked to enter two full names ( first and last).
//                You will determine if the two entered people are relatives by comparing their last names

        Scanner in = new Scanner(System.in);
        String name1 = in.nextLine().trim();
        String name2 = in.nextLine().trim();
        String last1 = name1.substring(name1.indexOf(" ") + 1);
        String last2 = name2.substring(name2.indexOf(" ") + 1);
        if (last1.equals(last2)) {
            System.out.println("relatives");
        } else {
            System.out.println("not relatives");
        }
    }
}
