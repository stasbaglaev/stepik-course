package collections.framework.treeset29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    /*
    Sample Input:
    6 11 9 18 10;12 13 19 8 16;3 4 5 15 20

    Sample Output:
    20
    19
    18
 */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] sets = reader.readLine().split(";");

        Set<Integer> set1 = getIntegerSet(sets, 0);
        Set<Integer> set2 = getIntegerSet(sets, 1);
        Set<Integer> set3 = getIntegerSet(sets, 2);

        Set<Integer> resultTreeSet = unionTreeLargeNumber(set1, set2, set3);
        resultTreeSet.forEach(System.out::println);
    }

    public static TreeSet<Integer> unionTreeLargeNumber(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
        TreeSet<Integer> resultSet = new TreeSet<>(Collections.reverseOrder());
        resultSet.add(((TreeSet<Integer>) set1).last());
        resultSet.add(((TreeSet<Integer>) set2).last());
        resultSet.add(((TreeSet<Integer>) set3).last());
        return resultSet;
    }

    private static Set<Integer> getIntegerSet(String[] stringArray, int indexArray) {
        Set<Integer> set = new TreeSet<>();
        for (String str : stringArray[indexArray].split(" ")) {
            set.add(Integer.valueOf(str));
        }
        return set;
    }
}
