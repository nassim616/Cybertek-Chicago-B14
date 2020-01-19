package polymorphism;

public class PaymentMethod {
    public  void charge (double amount ){
        System.out.println("amount charged "+amount);
    }
    public void refund (double amount ){
        System.out.println("amount refunded " + amount);
    }
}
