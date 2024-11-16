package org.example.java_8.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FuncationExample {
    public static void main(String[] args) {

        // function took something as input and return something

        Function<String,Integer> getLenth = x -> x.length();
        System.out.println(getLenth.apply("Sanjay"));

        Function<String, String> function = s -> s.substring(0,3);
        System.out.println(function.apply("Sanjay"));

        Function<List<Student>, List<Student>> studentsStartsWithAsPrefix = li -> {
            List<Student> result = new ArrayList<>();
            for (Student s : li) {
                if (s.getName().startsWith("San")) {
                    result.add(s);
                }
            }
            return result;
        };

        Student s1 = new Student("Sanjay",1);
        Student s2 = new Student("Rahul",2);
        Student s3 = new Student("Shivani bist",3);
        List<Student> students = Arrays.asList(s1,s2,s3);
        List<Student> filterStudent = studentsStartsWithAsPrefix.apply(students);
        System.out.println(filterStudent);

    }


    private static class  Student {
        String name;
        int id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }
    }
}
