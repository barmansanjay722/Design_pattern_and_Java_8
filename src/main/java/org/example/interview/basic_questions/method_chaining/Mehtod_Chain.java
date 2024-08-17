package org.example.interview.basic_questions.method_chaining;

public class Mehtod_Chain {
    public static void main(String[] args) {
        Student s = new Student();
//        s.setName("Sanjay");
//        s.setAge(20);
//        s.setCity("Delhi");

        s.setName("Sanjay").setAge(20).setCity("Delhi");

        System.out.println(s);
    }
}
