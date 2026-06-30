package exercise1;

public class Main {
    public static void main(String[] args) {

        // Get instance — Logger is created here (first time)
        Logger logger1 = Logger.getInstance();
        logger1.log("Application started");

        // Get instance again — NO new Logger created, same one returned
        Logger logger2 = Logger.getInstance();
        logger2.warn("Low memory warning");

        // Prove both variables point to the SAME object
        System.out.println("\nAre both instances the same? " + (logger1 == logger2));

        logger1.error("Something went wrong!");
    }
}