package org.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> imiona = Arrays.asList("Ala","Jacek");
        List<String> nowaListaImion = imiona.stream().filter(imie -> imie.endsWith("a"))
                .collect(Collectors.toList());
        System.out.println(nowaListaImion);
    }
}
