package task3;

public class Task3Runner {

    public static void runTask3() {

        Logging infoHandler = new InfoLogging();
        Logging errorHandler = new ErrorLogging();
        infoHandler.setNext(errorHandler);

        infoHandler.log("INFO", "Application started");
        infoHandler.log("ERROR", "Error");
    }
}
