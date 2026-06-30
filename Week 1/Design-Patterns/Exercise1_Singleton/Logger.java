package exercise1;

public class Logger {

    // Step 1: private static instance — only one will ever exist
    private static Logger instance;

    // Step 2: private constructor — nobody outside can do "new Logger()"
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Step 3: public method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Logging methods
    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }

    public void warn(String message) {
        System.out.println("[WARN]: " + message);
    }

    public void error(String message) {
        System.out.println("[ERROR]: " + message);
    }
}