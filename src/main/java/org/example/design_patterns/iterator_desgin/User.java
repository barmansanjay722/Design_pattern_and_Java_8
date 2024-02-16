package org.example.design_patterns.iterator_desgin;

public class User {

    private String name;
    private String userId;

    public User(String sanjay, String number) {
        this.setName(sanjay);
        this.setUserId(number);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
