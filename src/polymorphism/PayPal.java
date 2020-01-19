package polymorphism;

public class PayPal  extends PaymentMethod{
    @Override
    public void charge(double amount) {
        System.out.println("Amount charged in paypal" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("amount is charged in paypal " + amount );
    }
}
