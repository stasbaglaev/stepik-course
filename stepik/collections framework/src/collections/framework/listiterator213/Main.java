package collections.framework.listiterator213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Main {
    /*
        Sample Input:
        Iterator Hip Hoi Hap Iterator Hip Hi

        Sample Output:
        Iterator
        Hip
        Hop
        Hoi
        Hap
        Iterator
        Hip
        Hop
        Hi
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = Arrays.stream(reader.readLine().split(" ")).collect(Collectors.toList());
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            if (iterator.next().equals("Hip")) {
                iterator.add("Hop");
            }
        }
        list.forEach(System.out::println);
    }
}
