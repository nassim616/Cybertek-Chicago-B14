package polymorphism;

public interface Wifi {
    public abstract void sarchWifi();
    public static void m(){
        System.out.println("Static Method");
    }
    public  default void d(){

    }
}
