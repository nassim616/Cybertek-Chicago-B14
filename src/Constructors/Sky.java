package Constructors;

public class Sky {
   public Sky(String colorCode) {
        this.color = colorCode;

//       System.out.println("hi there");
   }

   public Sky(String color , int visibleStars) {
       this.visibleStars = visibleStars;
       this.color = color;
   }
       String color;
       int visibleStars;
   public void info(){
       System.out.println("\n my color: " + color);
       System.out.println(" visible star : " + visibleStars);
   }
    public static void main(String[] args) {

        Sky refsky = new Sky("blue");
        Sky s2 = new Sky("yellow",5);
       s2.info();
       refsky.info();
    }
}