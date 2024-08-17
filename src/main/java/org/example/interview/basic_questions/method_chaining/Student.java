package org.example.interview.basic_questions.method_chaining;

public class Student {
    private String name;
    private int age;
    private String city;

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Student setCity(String city) {
        this.city = city;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
