package Patterns.Observer.publisher;

import Patterns.Observer.listener.IEventListener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    private Map<String, List<IEventListener>> listenerMap = new HashMap<>();

    public EventManager(String... eventTypes){
        for (String eventType : eventTypes){
            this.listenerMap.put(eventType, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, IEventListener eventListener){
        List<IEventListener> subscribers = listenerMap.get(eventType);
        subscribers.add(eventListener);
    }

    public void unsubscribe(String eventType, IEventListener eventListener){
        List<IEventListener> subscribers = listenerMap.get(eventType);
        subscribers.remove(eventListener);
    }

    public void notify(String eventType, File file){
        List<IEventListener> subscribers = listenerMap.get(eventType);
        for (IEventListener subscriber : subscribers) {
            subscriber.update(eventType, file);
        }
    }
}
