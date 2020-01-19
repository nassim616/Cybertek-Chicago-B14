package polymorphism;

public class CreditCard extends PaymentMethod {

    @Override
    public void charge(double amount) {
        System.out.println("Amount charged in Credit Card" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Amount refunded in Credit Card " + amount);
    }
}
