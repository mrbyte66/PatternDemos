package Patterns.Observer.listener;

import java.io.File;

public class EmailNotificationListener implements IEventListener{
    private String email;

    public EmailNotificationListener(String email){
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": That you have registered for "+ eventType
                + " event with the following file :" + file);
    }
}
