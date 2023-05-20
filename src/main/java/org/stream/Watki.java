package org.stream;

import org.materialy.Level;
import org.materialy.Student;
import org.materialy.StudentFactory;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Watki {
    public static void main(String[] args) {


        List<Student>students = StudentFactory.generateStudents();

        long first = 1;
        long last= 50_000_000L;

        List<Long> list = LongStream
                .rangeClosed(first,last)
                .boxed()
                .collect(Collectors.toList());

        ///w Jednym watku
        Instant t1=Instant.now();
        list.stream().reduce(0L,Long::sum);
        Instant t2 = Instant.now();


        //wiele watkow
        Instant t3=Instant.now();
        list.stream().parallel().reduce(0L,Long::sum);
        Instant t4 = Instant.now();

        System.out.println("Czas operacji jednowątkowej: "+ Duration.between(t1,t2).toString());
        System.out.println("Czas operacji wielowatkowej: "+ Duration.between(t3,t4).toString());


        //studentsZPierwszaLiteraA.forEach(System.out::println);





    }
}
