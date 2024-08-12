package org.example.interview.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) throws IOException {

        try {
            // create object of Student
            Student student = new Student("Sanjay","sanjay@gmail.com",26,"Delhi");


            // write data to file
            FileOutputStream fos = new FileOutputStream("ob.txt");

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);

            // how to serilize
            objectOutputStream.writeObject(student);
            objectOutputStream.close();
            fos.close();
            System.out.println("Object state is transfer to file");
        }catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
