package arrays;

public class ForEachLoopUpperCase {
    public static void main(String[] args) {

        String[] things = {" Cucumber , Apples , Orange , Cookies , Cake"};


        int count = 0;
        for(String item: things) {
            char start = item.charAt(0);
            // if(Character.isUpperCase(start)); -> method takes character
            if(Character.isUpperCase(start)) {
                count++;
                System.out.println(item);
            }
//            if(start >= 65 && start <= 90) {
//                count++;
//            }
        }
        System.out.println(count);
    }
}
