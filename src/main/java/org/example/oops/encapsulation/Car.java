package org.example.oops.encapsulation;

public class Car {

    private String color;

    private String brancd;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrancd() {
        return brancd;
    }

    public void setBrancd(String brancd) {
        this.brancd = brancd;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private String model;

    private int year;

    private int speed;

    public void accelerate(int increment) {
       speed += increment;
    }

    public void brake(int decrement) {
        speed -= decrement;
        if(speed < 0) {
            speed = 0;
        }
    }


    // in this we acchive data hiding by getter and setter , and all the variable like color, brand
    // etc. we bundle it together  (encapsulation)
}
