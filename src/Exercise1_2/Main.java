package Exercise1_2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static List<String> getNamesAtOddIndices(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(names::get)
                .collect(Collectors.toList());
    }

    public static List<String> processNames(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Peter", "John", "Mary", "Sophia");

        List<String> oddIndexedNames = getNamesAtOddIndices(names);
        System.out.println(oddIndexedNames);

        List<String> processedNames = processNames(oddIndexedNames);
        System.out.println(processedNames);
    }
}
