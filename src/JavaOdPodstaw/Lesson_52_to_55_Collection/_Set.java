package JavaOdPodstaw.Lesson_51_Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class _Set {
    public static void main(String[] args) {

        java.util.List<String> list = new ArrayList<>();
        list.add("1_test_1");
        list.add("1_test_1"); // Set cannot contain duplicate elements
        list.add("2_test_2");
        list.add("6_test_3");
        list.add("3_test_4");

        Set<String> hashSet= new HashSet<>();// hashSet does't sort
        hashSet.addAll(list);

        Set<String> treeSet= new TreeSet<>(); //TreeSet sorts
        treeSet.addAll(list);

        System.out.println(hashSet);
        System.out.println(treeSet);
    }
}
