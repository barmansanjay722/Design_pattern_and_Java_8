package org.example.interview.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerial {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("ob.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Student student = (Student)objectInputStream.readObject();

            student.displayName();
            System.out.println(student.getName());
            System.out.println(student.getEmail());
            System.out.println(student.getAge());
            System.out.println(student.getAddress());

        }catch (IOException exception) {
            exception.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
