import task1.Task1Runner;
import task2.Task2Runner;
import task3.Task3Runner;

public class AppRunner {

    public static void main(String[] args) {
        //Strategy
        Task1Runner.runTask1();

        //Command
        Task2Runner.runTask2();

        //Chain of responsibility
        Task3Runner.runTask3();
    }
}
