package collections.framework.hashset27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    /*
    Sample Input:
    3 14 16 5 13 2 20 10 6 9;2 4 6 8 10 12 14 16 18 20

    Sample Output:
    3
    4
    5
    8
    9
    12
    13
    18
 */
    public static void main(String[] args) throws IOException {
//        Set<Integer> set1 = new HashSet<>(new LinkedList<>(Arrays.asList(1, 2, 3, 4)));
//        Set<Integer> set2 = new HashSet<>(new LinkedList<>(Arrays.asList(3, 4, 5, 6)));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = reader.readLine().split(";");

        Set<Integer> set1 = getIntegerSet(strings, 0);
        Set<Integer> set2 = getIntegerSet(strings, 1);

        symDifference(set1, set2).forEach(System.out::println);
    }

    public static Set<Integer> symDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersecting = new HashSet<>(set1);
        intersecting.retainAll(set2);
        set1.addAll(set2);
        set1.removeAll(intersecting);
        return set1;
    }

    private static Set<Integer> getIntegerSet(String[] stringArray, int indexArray) {
        Set<Integer> integerSet = new HashSet<>();
        for (String string : stringArray[indexArray].split(" ")) {
            integerSet.add(Integer.valueOf(string));
        }
        return integerSet;
    }
}
