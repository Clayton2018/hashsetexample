import java.util.HashSet;

public class CoinTestDriver {

    public static void main(String[] args) {

        HashSet<Coin> bagOfCoins = new HashSet<Coin>();

        Coin coin1 = new Coin(1);
        Coin coin2 = new Coin(2);
        Coin coin5 = new Coin(5);
        Coin coin10 = new Coin(10);
        Coin coin20 = new Coin(20);
        Coin coin50 = new Coin(50);
        Coin coin100 = new Coin(100);

        bagOfCoins.add(coin1);
        bagOfCoins.add(coin2);
        bagOfCoins.add(coin5);
        bagOfCoins.add(coin10);
        bagOfCoins.add(coin20);
        bagOfCoins.add(coin50);
        bagOfCoins.add(coin10);



        System.out.println("Value: " + bagOfCoins);

    }//end of main

    static void findCoin(){

        

    }


}//end of class
