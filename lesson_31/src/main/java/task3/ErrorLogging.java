package task3;

public class ErrorLogging extends Logging {

    @Override
    public void log(String level, String message) {
        if ("ERROR".equalsIgnoreCase(level)) {
            System.out.println("ERROR: " + message);
        } else if (next != null) {
            next.log(level, message);
        }
    }
}
