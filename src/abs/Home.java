package abs;

public abstract class Home {
//    Abstract class Home.
//    Instance variables: numOfRooms, address, maxNumOfGuests;
//    Methods: throwParty, lock, unlock, cook.
//    Override toString method. Build and return all info about Home.
//      Concrete classes: Apartment, Townhouse, SingleHouse.
//    Townhouse additional methods: shareWithNeighbor.
//    SingleHouse additional methods: cutGrass, shovelSnow.
//    SingleHouse additional variable: garageType.
//    Override toString method and include garageType info.
//


    int numOfRooms;
    int address;
    int maxNumOfGuests;


    public abstract void throwAParty();


    public abstract void lock();


    public abstract void unlock();


    public abstract void cook();


    @Override
    public String toString() {
        return "Home{" +
                "numOfRooms=" + numOfRooms +
                ", address=" + address +
                ", maxNumOfGuests=" + maxNumOfGuests +
                '}';

    }

}
