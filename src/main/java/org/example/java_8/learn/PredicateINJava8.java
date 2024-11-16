package org.example.java_8.learn;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateINJava8 {
    public static void main(String[] args) {

       /* Predicate<Integer> salaryGreateThenONeLac = x -> x > 100000;
        System.out.println(salaryGreateThenONeLac.test(1000000000));
*/
        Predicate<Integer> isEven = x -> x %2 ==0;
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        for(Integer i : numbers) {
            if(isEven.test(i)) {
                System.out.println(i);
            }
        }

        System.out.println("---------------------");

        Predicate<String> startsWithS = x -> x.toLowerCase().charAt(0) == 's';
        Predicate<String> endsWithY = x -> x.toLowerCase().charAt(x.length()-1) == 'y';
        Predicate<String> and = startsWithS.and(endsWithY);
        Predicate<String> or = startsWithS.or(endsWithY);
        System.out.println(and.test("sanjay"));
        System.out.println(or.test("shivani"));
        System.out.println(startsWithS.negate().test("Sanjay"));

        System.out.println("-------------");

        Student s1 = new Student("Sanjay", 1);
        Student s2 = new Student("Shivani bist", 2);
        Predicate<Student> studentPredicate = x -> x.getId() > 1;
        System.out.println(studentPredicate.test(s2));
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
    }

}


// predicate use for boolean value return,
