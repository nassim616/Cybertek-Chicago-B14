package classes;

public class DriverAndBankAccount {
    public static void main(String[] args) {
//        Car car1 = new Car();
//        car1.mileage = 5000;
//        car1.make = "nissan";
//        car1.sportEdition = true;
//        car1.year= 2010;
//        System.out.println(car1.mileage);
//       car1.drive(213);
//        System.out.println(car1.year);
//        car1.drive("downtown");


        BankAcount myBank =  new BankAcount();
        myBank.holderName = "nassim";
        myBank.acountNumber= 56312;
        myBank.type = "chase";
        myBank.acountNumber = 1234;

        System.out.println(myBank.acountNumber);
        myBank.deposit(1233 );
        myBank.transfer(500);
    }

}
