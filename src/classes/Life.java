package classes;

import java.util.Scanner;

public class Life {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        House myhouse = new House();

        System.out.println(" please enter the  house type :");
        myhouse.type =  in.nextLine();
        System.out.println(" the address :");
        myhouse.address = in.nextLine();
//
        System.out.println(" rooms numbers : ");
//
        myhouse.numRooms = in.nextInt();
        myhouse.info();

    }
}
