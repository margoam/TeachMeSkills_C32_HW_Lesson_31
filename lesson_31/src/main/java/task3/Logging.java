package task3;

public abstract class Logging {

    protected Logging next;

    public void setNext(Logging next) {
        this.next = next;
    }

    public abstract void log(String level, String message);
}
