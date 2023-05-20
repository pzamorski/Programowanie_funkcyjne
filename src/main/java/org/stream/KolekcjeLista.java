package org.stream;

import org.materialy.Student;
import org.materialy.StudentFactory;

import java.util.List;
import java.util.stream.Collectors;

public class KolekcjeLista {
    public static void main(String[] args) {


        List<Student>students = StudentFactory.generateStudents();

        List<Student> list = students.stream()
                .filter(student -> student.getAverageGrade() >= 4.5)
                .collect(Collectors.toList());
        list.forEach(System.out::println);

//      Lista nie modyfikowalna
        List<Student> list2 = students.stream()
                .limit(5)
                .collect(Collectors.toUnmodifiableList());//<--
        try {
            list2.remove(2);
        }catch (UnsupportedOperationException e){
            System.out.println("Błędna operacja na liście błąd typu");
        }





    }
}
