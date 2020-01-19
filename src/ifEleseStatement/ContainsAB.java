package ifEleseStatement;
import java.util.Scanner;
public class ContainsAB {
    public static void main(String[] args) {



    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter:");

    String n = scanner.next();



    boolean validAb = !n.contains("a") && !n.contains("b");
    boolean validA = !n.contains("a");
    boolean validB = !n.contains("b");

  if (validAb && validA && validB ){
        System.out.println("Sorry");
    }
  else if (!validAb){
        if (n.length() >= 7 && n.length() <= 10){
            System.out.println("B Perfect");
        }
        else if (!validA){
            if (n.length() < 5){
                System.out.println("A Perfect");
            } else if (n.length() <7 || n.length() > 10){
                System.out.println("");
            } }
        else if (!validB){
            if (n.length() <7 || n.length() > 10){
                System.out.println("Perfect");
            }
        }
    }

}

}
