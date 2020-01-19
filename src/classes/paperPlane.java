package classes;

public class paperPlane {
    public static void main(String[] args) {

       // creat 2 flags objevts

        // set all values to first one only
        // and copy first objects instance variable value to second one
        // and rest / reassingn the first objects values to zero to numbers
       // and 'a' to String .
        Flag f1 = new Flag();
        Flag f2 = new Flag();
        f1.matrial = "Wood";
        f1.size = 6;
        f1.country = "usa";
        f1.color = "red , white";

        f1 .color= f2.color;
        f1.country= f2.country;
        f1.size= f2.size;
        f1.matrial=f2.matrial;

        f1.matrial= "a";
        f1.size = 0;
        f1.country="a";
        f1.color="a";
        f1.info();
        f2.info();


        f1.upgrade(6,"gold");
        f1.info();
    }
}
