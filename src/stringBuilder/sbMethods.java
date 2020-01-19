package stringBuilder;

public class sbMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("car");
        sb.reverse();
        sb.delete(0,2);
        sb.insert(0,"hey");
        System.out.println(sb);
    }
}
