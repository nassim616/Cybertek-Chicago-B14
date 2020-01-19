package classes;

public class BankAcount {
//    2. Create a class BankAccount
//Instance variables: type, accountNumber, balance,
//    holderName Methods:
//    deposit. Method accepts double and it doesn’t return anything. Method should simply print “%double is deposited to your account” and add given double to the balance.
//    transfer -> accepts double -> Method should print “%double $ is transferred from your account” and decrement balance by given amount.
//    info -> Method doesn’t accept or return anything. It should simply print the information about the BankAccount as below format
//    Name: %holderName
//    Balace: %balance
//    Type: %type
//    Account Number: %accountNumber

    String  holderName;
   String type ;
    int acountNumber ;
    double balance ;



    public void deposit ( double amount){
        System.out.println( amount  + " is deposited to your account ");
        this.balance+= amount;
    }
    public void transfer (double amount){
        if (this.balance>= amount ){
            System.out.println(amount + " $ is transfred to your account ");
            balance -= amount;

        }
        else {
            System.out.println("you dont have enough funds . transfer");
        }
    }
    public void  info (){

        System.out.println(" \nNanme : " + this.holderName );
        System.out.println(" balance : " + this.balance + " $ " );
        System.out.println("type : " + this.type);
        System.out.println("acountNumber : " + this.acountNumber);
    }

}
