package vavr;

import io.vavr.collection.HashMap;
import io.vavr.collection.Stream;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Wprowadzenie {

    @Test
    public void test(){
        Stream<Integer>stream = Stream.from(1)
                .filter(x->x%3==0)
                .take(100);

        List<String> collect = stream.takeWhile(x -> x <= 50)
                .map(Objects::toString)
                .collect(Collectors.toList());

        System.out.println(collect);




    }
}
