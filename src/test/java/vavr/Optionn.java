package vavr;

import io.vavr.collection.Stream;
import io.vavr.control.Option;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Optionn {

    @Test
    public void test(){

        String s = null;
        String wartoscDomyslna = Option.of(s)
                .map(String::toUpperCase)
                .getOrElse("Wartosc domyslna");

        System.out.println(wartoscDomyslna);





    }
}
