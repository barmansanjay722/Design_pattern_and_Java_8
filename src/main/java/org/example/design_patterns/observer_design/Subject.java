package org.example.design_patterns.observer_design;

public interface Subject {
    void subscribe(Observer ob);
    void unsbscribe(Observer ob);

    void videoUploaded(String title);
}
