package abs;

public class Apartment extends Home {

   //   Concrete classes: Apartment, Townhouse, SingleHouse.
//    Townhouse additional methods: shareWithNeighbor.
//    SingleHouse additional methods: cutGrass, shovelSnow.
//    SingleHouse additional variable: garageType.
//    Override toString method and include garageType info.

    @Override
    public void throwAParty() {
        System.out.println("Throwing a party in Apartment");
    }

    @Override
    public void lock() {
        System.out.println("Locking my Apartment");
    }

    @Override
    public void unlock() {
        System.out.println("Opening my apartment");
    }

    @Override
    public void cook() {
        System.out.println("Cooking something at my apartment");
    }
}