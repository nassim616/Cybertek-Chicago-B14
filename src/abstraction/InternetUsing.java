package abstraction;

public class InternetUsing {
    public static void main(String[] args) {
        Chrome chrome = new Chrome();
        chrome.version = 76.8;
        chrome.launch();
        chrome.browse("www.stackoverflow.com");
        System.out.println();
        Firefox firefox = new Firefox();
    }
}
