package org.example.design_patterns.observer_design;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel();
        Subscriber subscriber = new Subscriber("Sanjay");
        Subscriber subscriber2 = new Subscriber("Shivani");

        youtubeChannel.subscribe(subscriber);
        youtubeChannel.subscribe(subscriber2);
        youtubeChannel.videoUploaded("Learn Design pattern");
        youtubeChannel.videoUploaded("New React Courser");

    }
}
