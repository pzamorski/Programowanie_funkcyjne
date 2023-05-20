package org.stream;

import org.materialy.Level;
import org.materialy.Student;
import org.materialy.StudentFactory;

import java.util.List;

public class Reduktory {
    public static void main(String[] args) {


        List<Student>students = StudentFactory.generateStudents();
        List<Integer> list = List.of(3,-5,1,-15,-8,3,4);
        Integer integer = list.stream()
                .min(Integer::compareTo).get();
        System.out.println(integer);

        Double aDouble = students.stream()
                .map(Student::getAverageGrade)
                .reduce(0.0,Double::sum);

        System.out.println(aDouble);



    }
}
