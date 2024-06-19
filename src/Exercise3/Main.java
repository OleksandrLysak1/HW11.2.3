package Exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] arr = {"1, 2, 0", "4, 5"};

        List<Integer> numbers = new ArrayList<>();

        for (String str : arr) {

            String[] parts = str.split(", ");

            for (String part : parts) {

                numbers.add(Integer.parseInt(part));
            }
        }

        Collections.sort(numbers);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numbers.size(); i++) {
            result.append(numbers.get(i));
            if (i < numbers.size() - 1) {
                result.append(", ");
            }
        }

        System.out.println(result.toString());
    }
}
