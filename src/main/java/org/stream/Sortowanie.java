package org.stream;

import org.materialy.Level;
import org.materialy.Student;
import org.materialy.StudentFactory;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sortowanie {
    public static void main(String[] args) {


        List<Student>students = StudentFactory.generateStudents();

        //Sortowanie naturalne
        List<Integer> list = List.of(3,6,1,10,15,-3,-1,5);
        List<Integer> sortetInteger = list.stream()
                .sorted(Comparator.comparing(Integer::intValue))//<-sorted()
                .collect(Collectors.toList());
        sortetInteger.forEach(System.out::println);

        students.stream()
                .sorted(Comparator.comparing(Student::getSurname,Comparator.reverseOrder()).
                        thenComparing(Student::getName))
                .forEach(System.out::println);

        //obsluga nulli

        students.add(null);
        List<Student> lista1 = students.stream()
                .sorted(Comparator.nullsLast(Comparator.comparing(Student::getSurname)))//lub nullFirst
                .collect(Collectors.toList());
        lista1.forEach(System.out::println);
    }
}