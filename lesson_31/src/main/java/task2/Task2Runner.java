package task2;

import task2.service.LightOffCommand;
import task2.service.LightOnCommand;
import task2.service.RemoteControl;

public class Task2Runner {

    public static void runTask2() {

        Light light = new Light();
        RemoteControl remote = new RemoteControl();
        remote.setCommand(new LightOnCommand(light));
        remote.pressButton();
        remote.setCommand(new LightOffCommand(light));
        remote.pressButton();
    }
}
