package collections.framework.hashset26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    /*
    Sample Input:
    1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

    Sample Output:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
 */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = reader.readLine().split(" ");

        Set<Integer> set = new HashSet<>();
        for (String string : strings) {
            set.add(Integer.valueOf(string));
        }

        List<Integer> helpList = getList();
        set.addAll(helpList);

        removeAllNumbersMoreThan10(set).forEach(System.out::println);
    }

    public static Set<Integer> removeAllNumbersMoreThan10(Set<Integer> set) {
        set.removeIf(integer -> integer > 10);
        return set;
    }

    private static List<Integer> getList() {
        return new LinkedList<>(Arrays.asList(5, 1, 17, 19, 2));
    }
}
