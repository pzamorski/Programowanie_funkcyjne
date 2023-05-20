package org.stream;

import org.materialy.Level;
import org.materialy.Student;
import org.materialy.StudentFactory;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class KolekcjeInne {
    public static void main(String[] args) {

        //joining
        List<String> list = List.of("Ala","ma","kota","i","dwa","psy");
        String collect = list.stream().collect(Collectors.joining("/","->","<-"));
        System.out.println(collect);


        //min max
        List<Integer> list1 =List.of(21,-15,34,85,16,-2,23);
        Optional<Integer> min = list1.stream().collect(Collectors.minBy(Integer::compareTo));
        System.out.println(min);
        Optional<Integer> max = list1.stream().collect(Collectors.maxBy(Integer::compareTo));
        System.out.println(max);

        //stat
        List<Student>students = StudentFactory.generateStudents();
        DoubleSummaryStatistics statistics = students.stream().collect(Collectors.summarizingDouble(Student::getAverageGrade));
        System.out.println("Max: "+statistics.getMax());
        System.out.println("Srednia: "+statistics.getAverage());
        System.out.println("Min: "+statistics.getMin());
        System.out.println("Ilosc: "+statistics.getCount());
        System.out.println("Suma: "+statistics.getSum());

        //
        Map<Boolean, List<Student>> collect1 = students.stream()
                .skip(5)
                .limit(10)
                .collect(Collectors.partitioningBy(student -> student.getAverageGrade() > 4.0));

        collect1.forEach((k, v) -> System.out.println("czy srednia > 4.0 "+k+" to:" +v));
    }
}
