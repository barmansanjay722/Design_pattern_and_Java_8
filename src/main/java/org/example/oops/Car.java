package org.example.oops;

public class Car {

    String color;

    String brancd;

    String model;

    int year;

    int speed;

    public void accelerate(int increment) {
       speed += increment;
    }

    public void brake(int decrement) {
        speed -= decrement;
        if(speed < 0) {
            speed = 0;
        }
    }
}
