package collections.framework.listiterator214;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Main {
    /*
        Sample Input 1:
        ImageButton JTextField JTextArea CheckBox JMenu

        Sample Output 1:
        Menu
        TextArea
        TextField
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = Arrays.stream(reader.readLine().split(" ")).collect(Collectors.toList());
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (!str.startsWith("J")) {
                iterator.remove();
            }
            if (str.startsWith("J")) {
                iterator.set(str.substring(1));
            }
        }
        Collections.reverse(list);
        list.forEach(System.out::println);
    }
}
