package classes;

public class Flag {
    String country;
    int size;
    String color;
    String matrial;

    public void info() {
        System.out.println("country: " + country);
        System.out.println("size: " + size);
        System.out.println("color: " + color);
        System.out.println("matrial: " + matrial);
    }


    public void flap() {
        System.out.println("flag is flapping");
    }

    public void upgrade(int size , String material) {
     this.size = size;
     this.matrial= material;


    }

}