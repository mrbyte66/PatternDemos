package Patterns.Observer.listener;

import java.io.File;

public class LogOpenListener implements IEventListener{
    private File log;

    public LogOpenListener(String fileName){
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log" + log + "That you have registered for " + eventType
                + " event with the following file: " + file);
    }
}
