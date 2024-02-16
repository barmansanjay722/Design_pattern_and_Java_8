package org.example.design_patterns.observer_design;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{

    List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer ob) {
        this.subscribers.add(ob);
    }

    @Override
    public void unsbscribe(Observer ob) {
        this.subscribers.remove(ob);
    }

    @Override
    public void videoUploaded(String title) {
        for(Observer observer: this.subscribers) {
            observer.notified(title);
        }
    }
}
