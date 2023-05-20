package org.stream;

import org.materialy.Level;
import org.materialy.Student;
import org.materialy.StudentFactory;

import java.util.List;

public class Filtrowanie {
    public static void main(String[] args) {


        List<Student>students = StudentFactory.generateStudents();
        long countStream = students.stream()
                .filter(student -> student.getName().startsWith("A"))
                .filter(student -> student.getLevel().equals(Level.III))
                .filter(student -> student.getAverageGrade() >= 3.5)
                .count();
        System.out.println(countStream);


        //studentsZPierwszaLiteraA.forEach(System.out::println);





    }
}
