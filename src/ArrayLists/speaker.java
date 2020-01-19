package ArrayLists;

import java.util.ArrayList;

public class speaker {
    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>();
//        names.add("james");
//        names.add("adam");
//        names.add(1,"john");
//        System.out.println(names);
//        System.out.println(names.get(1));
        // how to use List for any objects.
        ArrayList <Cat> catasForSale = new ArrayList<>();
        Cat cat1 = new Cat();
        cat1.color = "white ";
        cat1.age = 3;
        catasForSale.add(cat1);

        Cat cat2 = new Cat();
        cat2.color= "red";
        cat2.age = 1;
        catasForSale.add(cat2);
        System.out.println( catasForSale.size());
        for (int i = 0 ; i<catasForSale.size();i++){
            System.out.println("color#"+ (i+1));
            System.out.println("color: " + catasForSale.get(i).color);
            System.out.println("Age : " + catasForSale.get(i).age);
            System.out.println();
        }

    }
}
