package org.example.design_patterns.builder_desgin;

public class Main {
    public static void main(String[] args) {

        User user =new User.UserBuilder()
                .setUserId("userId1")
                .setEmailId("sanjay.barman@gamail.com")
                .setUserName("Sanjay Barman").build();

        System.out.println(user);
    }
}
