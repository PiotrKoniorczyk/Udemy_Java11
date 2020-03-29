package JavaForBeginner.Lesson_52_to_55_Collection;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class _Stream {
    public static void main(String[] args) {
        java.util.List<String> list = new ArrayList<>();
        list.add("a_test_1");
        list.add("c_test_2");
        list.add("ab_test_3");


        list.stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        IntStream.range(0, 10)
                .forEach(System.out::print);
    }
}
