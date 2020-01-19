package classes;

public class Testing {
    public static void main(String[] args) {
        String name = "james";
        Flag f1 = new Flag();
        f1.country= "usa";
        f1.color = "red / white";
        f1.size = 5;
        f1.matrial = "wood";
       System.out.println(f1.country);
        f1.flap();
        Flag f2 = new Flag();
        System.out.println(f2.country);
        f1.info();

    }



}
