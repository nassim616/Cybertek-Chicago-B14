package ArrayLists;

import Constructors.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {         // class
    String name;
    String address;
    int numberOfItems;
    double totalSales;

    // ArrayList<Cat> catasForSale = new ArrayList<>();
    ArrayList<Item> items = new ArrayList<>();

    public Store(String name, String address) {              // costructor
        this.name = name;
        this.address = address;

    }

    public void addItem(Item item) {
        // method
        this.items.add(item);
        this.numberOfItems++;
    }

//    Overload the method addItem.
//    Method doesn't take anything.
//    This method should ask user how many items to enter.
//    Method should ask Item name and price and add the Item to the items list based on the quantity user entered.

//    public void addItem() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("how many items do you want enter");
//        int quantity = scanner.nextInt();
//        scanner.nextLine();
//        for (int i = 0; i < quantity; i++) {
//            System.out.println(" enter name for item# " + (i + 1));
//            String name = scanner.nextLine();
//            System.out.println("enter price for item# " + (1 + i));
//            double price = scanner.nextDouble();
//            scanner.nextLine();
//            Item item = new Item(name, price);
//           this.items.add(item);
//            items.add(item);
//            this.numberOfItems++;
//        }
    //  }

    public void sellItem(String itemName) {

//     Modify Store class.
//     Add instance variable totalSales.
//     Create method sellItem. Method accepts name of the Item and doesn’t return anything.
//         Check if name of the item is in the list. If it’s in stock remove from the list and add the price to totalSales
//     and give success transaction message. If doesn’t exist in the list give failed transaction message and terminate the method.


    }

    //Create method returnItem. Method takes item name and doesn’t return anything.
//         Ask user to enter the price of an item. Then create Item object from given information and add to the items list.
//             Also maintain totalSales.

    public void returnItem(String itemName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter price of the returned item");
        double itemPrice = scanner.nextDouble();
        Item item = new Item(itemName, itemPrice);
        items.add(item);

    }








    public void seeInventory() {
        // method
        for (Item item : items) {
            item.info();

        }
    }
}