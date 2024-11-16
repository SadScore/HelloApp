package stream;

import java.util.Optional;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        Stream<Integer> numbersStream = Stream.of(1,2,3,4,5,6);
        Optional <Integer> result = numbersStream.reduce((x,y) -> x * y);
        System.out.println(result.get());


        Stream<String > wordsStream = Stream.of("Привет", "как", "дела");
        Optional <String > sentence = wordsStream.reduce((x,y) -> x + " " + y);
        System.out.println(sentence.get());
    }
}
