package Patterns.Observer;

import Patterns.Observer.editor.Editor;
import Patterns.Observer.listener.EmailNotificationListener;
import Patterns.Observer.listener.LogOpenListener;

public class ObserverDemo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.eventManager.subscribe("open", new LogOpenListener("path/to/log"));
        editor.eventManager.subscribe("save", new EmailNotificationListener("admin@admin.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
