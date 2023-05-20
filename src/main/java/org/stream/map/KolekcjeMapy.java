package org.stream.map;

import org.materialy.Student;
import org.materialy.StudentFactory;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class KolekcjeMapy {
    public static void main(String[] args) {


        List<Student>students = StudentFactory.generateStudents();

        Map<Long, Double> mapID = students.stream()
                .limit(20)
                .collect(Collectors.toMap(Student::getId, Student::getAverageGrade));

        mapID.forEach((k, v) -> System.out.println("ID: "+k+" average="+v));

        //Nie modyfikowalna mapa
        Map<Long, Double> mapaNieModyfikowalana = students.stream()
                .limit(20)
                .collect(Collectors.toUnmodifiableMap(Student::getId, Student::getAverageGrade));
        try {
            mapaNieModyfikowalana.remove(0);
        }catch (UnsupportedOperationException e){
            System.out.println("Nie właściwa operacja na mapie");
        }

        //Mapa z takimi samymi kluczami
        try {
            students.stream()
                    .collect(Collectors.toUnmodifiableMap(Student::getName, Student::getSurname));
        }catch (IllegalStateException e){
            System.out.println("Wystapil duplikat "+e.toString());
        }
    }
}
