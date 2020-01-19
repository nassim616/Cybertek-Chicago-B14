package abs;

public class Chrome extends Browser{
    @Override
    public void launch(){
        System.out.println("Chrome is launching");
    }
    @Override
    public void browse(String url){
        System.out.println("Chrome is browsing URL : " + url );
    }
    @Override
    public  int getNumOfTabs(){
        System.out.println(" chrome is returning umber of tabs open ");
        return 10;
    }
}
