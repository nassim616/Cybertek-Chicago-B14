package StringManipulation;

public class not {
    public static void main(String[] args) {
        String word = " today is a nice day ";
        boolean b = word.startsWith("today");
        System.out.println(b);;
        System.out.println("not: " + !b );
        System.out.println(!word.endsWith("day"));
        System.out.println(!word.startsWith("day"));

    }
}
