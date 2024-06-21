package Exercise5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.collect(Collectors.toList());
        List<T> secondList = second.collect(Collectors.toList());

        int minSize = Math.min(firstList.size(), secondList.size());

        return IntStream.range(0, minSize)
                .boxed()
                .flatMap(i -> Stream.of(firstList.get(i), secondList.get(i)));
    }

    public static void main(String[] args) {
        Stream<String> first = Stream.of("a", "b", "c");
        Stream<String> second = Stream.of("1", "2", "3", "4");

        Stream<String> result = zip(first, second);
        result.forEach(System.out::println); // виведе "a", "1", "b", "2", "c", "3"
    }
}