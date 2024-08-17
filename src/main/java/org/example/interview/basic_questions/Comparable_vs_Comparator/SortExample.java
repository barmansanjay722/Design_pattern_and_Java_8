package org.example.interview.basic_questions.Comparable_vs_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
    public static void main(String[] args) {

        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp("Sanjay", "958908501", 12));
        emps.add(new Emp("Rahul", "958908501", 111));
        emps.add(new Emp("Manik", "958908501", 11));
//        System.out.println(emps);

        // Comparator
            // -> comparator is use for multiple sorting logic ( it has compare method)
        Collections.sort(emps, new IdComparator());
//        System.out.println(emps);



        ArrayList<Emp> empsid = new ArrayList<>(emps);
        Collections.sort(empsid, new NameComparator());
//        System.out.println(empsid);


        // =====>

        ArrayList<Emp1> emps1 = new ArrayList<>();
        emps1.add(new Emp1("Sanjay", "958908501", 12));
        emps1.add(new Emp1("Rahul", "958908501", 111));
        emps1.add(new Emp1("Manik", "958908501", 11));
        System.out.println(emps1);

        // Comparable
        // -> comparable is uer for single sorting logic

        Collections.sort(emps1);
        System.out.println(emps1);
    }
}
