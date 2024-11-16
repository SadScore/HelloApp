package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(1,-2,3,4,5,6)
        );
        Optional<Integer> min = numbers.stream().max(Integer::compare);
        System.out.println(min.get());





    }
}
