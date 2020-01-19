package polymorphism;

public class BankAccount extends PaymentMethod {
    @Override
    public void charge(double amount) {
        System.out.println("amount charging in BAnk Account ");
    }

    @Override
    public void refund(double amount) {
        System.out.println("amount refunding in Bank Account");
    }
}
