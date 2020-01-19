package Constructors;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone("IPhone X", "Gold");
        phone.info();
        phone.memory = 45;
        phone.info();
        Phone samsung = new Phone("Samsung Galaxy", "Black", -45, true);
        samsung.info();
        System.out.println("-----------------");
    samsung.textNumber( 747 , "whats up ");
    phone.call(1238654123);
    }
}
