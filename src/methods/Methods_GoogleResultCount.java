package methods;

public class Methods_GoogleResultCount {

    public static void main(String[] args) {
        System.out.println(resultCount("About 94,500,000 results (0.62 seconds)"));
    }

    public static String resultCount(String count){
        String []temp = count.split("");
        String secondWord = temp[1];
        String removeCommas = secondWord.replace("," , "");
        return removeCommas;


    }
}
