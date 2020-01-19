package abstraction;

public class Browser  {
    String name ;
    double version;
    double size ;
    public void launch(){
        System.out.println("browser is lanching");
    }
    public void browse (String url){
        System.out.println("browser is browsing url"+ url);
    }
    public void addTab(String url){
        System.out.println("browser is adding tab for url " + url);
    }
}
