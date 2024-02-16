package org.example.design_patterns.iterator_desgin;

public class Main {
    public static void main(String[] args) {

        UserManagement userManagement = new UserManagement();
        userManagement.addUser(new User("Sanjay","1"));
        userManagement.addUser(new User("Rahul","2"));
        userManagement.addUser(new User("Ritu","3"));
        userManagement.addUser(new User("Monika","4"));

        MyInterator myInterator = userManagement.getIterator();
        while (myInterator.hasNext()) {
            User user = (User) myInterator.next();
            System.out.println(user.getName());
        }
    }
}
