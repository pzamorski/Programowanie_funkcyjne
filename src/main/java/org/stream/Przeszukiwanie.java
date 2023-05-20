package org.stream;

import org.materialy.Level;
import org.materialy.Student;
import org.materialy.StudentFactory;

import java.util.List;
import java.util.function.Predicate;

public class Przeszukiwanie {
    public static void main(String[] args) {


        List<Student>students = StudentFactory.generateStudents();

        Student student1 = students.stream()
                .filter(student -> student.getAverageGrade() > 3.0)
                .findFirst().get();

        System.out.println(student1.toString());

//
        Student student2 = students.stream()
                .filter(student -> student.getAverageGrade() > 3.0)
                .findAny().get();

        System.out.println(student2);


    }
}
