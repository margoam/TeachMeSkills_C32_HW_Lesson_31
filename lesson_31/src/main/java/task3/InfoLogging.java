package task3;

public class InfoLogging extends Logging {

    @Override
    public void log(String level, String message) {
        if ("INFO".equalsIgnoreCase(level)) {
            System.out.println("INFO: " + message);
        } else if (next != null) {
            next.log(level, message);
        }
    }
}
