package org.stream;

import org.materialy.Level;
import org.materialy.Student;
import org.materialy.StudentFactory;

import java.util.List;
import java.util.stream.Collectors;

public class Peek {
    public static void main(String[] args) {


        List<Student>students = StudentFactory.generateStudents();


        //tylko do debugowania
        List<Student> studenci_jany = students.stream()
                .peek(student -> {
                    student.setName("Jan");
                    student.setSurname("Kowalski");
                })
                .collect(Collectors.toList());

        studenci_jany.forEach(System.out::println);


        //studentsZPierwszaLiteraA.forEach(System.out::println);





    }
}
