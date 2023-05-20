package org.stream.map;

import org.materialy.Level;
import org.materialy.Student;
import org.materialy.StudentFactory;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMaps {
    public static void main(String[] args) {


        List<Student>students = StudentFactory.generateStudents();

        Map<Long,Double> map = students.stream().collect(Collectors.toMap(Student::getId,Student::getAverageGrade));

        //I sposob
        Set<Long> keys = map.keySet();
        keys.stream();


        //II sposob
        Collection<Double> values = map.values();
        values.stream();




        //studentsZPierwszaLiteraA.forEach(System.out::println);





    }
}
