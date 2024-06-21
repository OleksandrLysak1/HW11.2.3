package Exercise3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

        public static String processArray(String[] array) {
            return Arrays.stream(array)
                    .flatMap(s -> Arrays.stream(s.split(", ")))
                    .map(Integer::parseInt)
                    .sorted()
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));
        }

        public static void main(String[] args) {
            String[] array = {"1, 2, 0", "4, 5"};
            String result = processArray(array);
            System.out.println(result); // виведе "0, 1, 2, 4, 5"
        }
    }