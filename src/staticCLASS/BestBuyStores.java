package staticCLASS;

public class BestBuyStores {
    public static void main(String[] args) {
        BestBuy storeOne = new BestBuy();
        BestBuy storeTwo = new BestBuy();

        System.out.println(storeOne.numOfcumputers);

        storeOne.numOfcumputers--;

        System.out.println(storeOne.numOfcumputers);
    }
}
