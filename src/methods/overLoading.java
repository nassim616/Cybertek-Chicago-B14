package methods;

public class overLoading {
    public static void main(String[] args) {

        jump();
        jump("nike");
        jump(5);
        String[] arr = {"d"};
        System.out.println(jump(arr));
    }

    public static void jump() {
        System.out.println("you dont get far");

    }

    public static void jump(String shoes) {
        System.out.println("the shoes made you  go farther ");
    }

    public static void jump(int distance) {
        System.out.println(" you jumped " + distance);
    }

    public static String jump(String[] arr) {
        return "jumped by array";
    }

}
