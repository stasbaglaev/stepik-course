package collections.framework.workwithlist22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Sample Input:
1 177 8 700 785 4635 3489 52 7418 43 36 8695 3 64

Sample Output:
[[8, 36, 52, 64, 700, 7418], [3, 36, 177, 3489, 4635], [1, 43, 785, 8695]]
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String allElements = reader.readLine();
        List<Integer> bigList = createBigList(allElements);

        ArrayList<Integer> div2list = new ArrayList<>(bigList);
        div2list.removeIf(i -> i % 2 != 0);
        ArrayList<Integer> div3list = new ArrayList<>(bigList);
        div3list.removeIf(i -> i % 3 != 0);
        ArrayList<Integer> otherlist = new ArrayList<>(bigList);
        otherlist.removeAll(div2list);
        otherlist.removeAll(div3list);

        Collections.sort(div2list);
        Collections.sort(div3list);
        Collections.sort(otherlist);

        List<List<Integer>> resultList = createListOfLists(div2list, div3list, otherlist);

        //Этот метод реализован в проверяющей системе
//        printInLine(resultList);

        System.out.println(resultList);
    }

    public static List<Integer> createBigList(String str) {
        List<Integer> bigList = new ArrayList<>();
        String[] strarr = str.split(" ");

        for (String s : strarr) {
            bigList.add(Integer.valueOf(s));
        }
        return bigList;
    }

    public static List<List<Integer>> createListOfLists(List<Integer> div2list, List<Integer> div3list, List<Integer> otherList) {
        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(div2list);
        resultList.add(div3list);
        resultList.add(otherList);
        return resultList;
    }
}
