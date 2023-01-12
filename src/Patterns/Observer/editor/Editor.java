package Patterns.Observer.editor;

import Patterns.Observer.publisher.EventManager;

import java.io.File;

public class Editor {
    public EventManager eventManager;
    private File file;

    public Editor(){
        //now we have 2 kinds of events which we can subscribe on file obj
        this.eventManager = new EventManager("open","save");
    }

    public void openFile(String filePath){
        this.file = new File(filePath);
        eventManager.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null){
            eventManager.notify("save",file);
        } else {
            throw new Exception("Please open a file firt.");
        }
    }
}
