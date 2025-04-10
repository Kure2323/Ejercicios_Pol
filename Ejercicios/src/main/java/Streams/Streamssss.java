package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamssss {

    public static void main(String[] args) {

        Stream<Integer> numeros = Stream.of(1,2,3,4,5);
        List<Integer> numeritos = new ArrayList<>(Arrays.asList(1,2,3,4,5,45,136,233,2,3));

        List<Integer> filtrados = numeritos.stream()
                  .filter(nums -> nums > 10)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(filtrados);

        long largo = numeritos.stream()
                .filter(nums -> nums > 10)
                .distinct()
                .count();

        System.out.println(largo);


        long sumita = numeritos.stream()
                .filter(nums -> nums > 10)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumita);


        List<String> pueblos = new ArrayList<>(Arrays.asList("Elche", "San Vicente", "Mutxamel", "Eliana"));

        //Filtros randoms por la cara
        pueblos.stream()
                .map(String::toUpperCase)
                .filter(palabra -> palabra.contains("I"))
                .filter(pueblo -> pueblo.endsWith("A"))
                .forEach(System.out::println);


//        pueblos.stream()
//                .sorted()
//                .distinct()
//                .map()
//                .forEach(System.out::println);


    }


}
