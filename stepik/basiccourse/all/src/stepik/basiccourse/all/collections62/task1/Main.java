package stepik.basiccourse.all.collections62.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(0, 1, 2));

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(symmetricDifference(set1, set2));

    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> set3 = new HashSet<>();
        for (T element : set1) {
            if (!set2.contains(element)) {
                set3.add(element);
            }
        }
        for (T element : set2) {
            if (!set1.contains(element)) {
                set3.add(element);
            }
        }
        return set3;
    }
}
