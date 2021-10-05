package collections.framework.arraylistbasic21.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hi");
        list.add("hello");
        list.add("goodmorning");
        list.add("ass");

        System.out.println(changeList(list));
    }

    static List<String> changeList(List<String> list) {
        String str = Collections.max(list, Comparator.comparingInt(String::length));
        list.replaceAll(s -> str);
        return list;
    }

    static List<String> changeList2(List<String> list) {
        String str = Collections.max(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.set(str);
        }
        return list;
    }

}
