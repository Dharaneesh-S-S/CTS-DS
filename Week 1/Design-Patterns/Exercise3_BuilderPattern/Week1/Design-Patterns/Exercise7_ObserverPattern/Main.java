package exercise7;

public class Main {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileUser =
                new MobileApp("Darshan");

        Observer webUser =
                new WebApp("Admin");

        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        stockMarket.setStock("CTS", 3500);

        System.out.println();

        stockMarket.setStock("Infosys", 1800);
    }
}