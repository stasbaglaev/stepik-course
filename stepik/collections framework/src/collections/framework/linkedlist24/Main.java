package collections.framework.linkedlist24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

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
    11
    12
    13
    14
    15
    16
    17
 */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        LinkedList<Integer> list = new LinkedList<>();
        for (String string : str) {
            list.add(0, Integer.valueOf(string));
        }
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        Collections.sort(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
