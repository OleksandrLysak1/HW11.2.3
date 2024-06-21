package Exercise1_2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Person {
    public static String processNames(List<String> names) {

        List<String> filteredNames = IntStream.range(0, names.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(names::get)
                .collect(Collectors.toList());

        List<String> uppercasedAndSortedNames = filteredNames.stream()
                .map(String::toUpperCase)
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());

        return IntStream.range(0, uppercasedAndSortedNames.size())
                .mapToObj(i -> (i * 2 + 1) + ". " + uppercasedAndSortedNames.get(i))
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Peter", "John", "Mary", "Sophia");
        String result = processNames(names);
        System.out.println(result);
    }
}