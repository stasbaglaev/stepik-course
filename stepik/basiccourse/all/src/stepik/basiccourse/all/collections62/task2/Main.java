package stepik.basiccourse.all.collections62.task2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String[] arrayNumbers = {};
        List<Integer> integerList = new ArrayList<>();
        if (in.hasNext()) {
            arrayNumbers = in.nextLine().split(" ");
        }
        for (String integer : arrayNumbers) {
            integerList.add(Integer.valueOf(integer));
        }
        for (int i = integerList.size(); i > 0; i--) {
            if (i % 2 == 0) {
                System.out.print(integerList.get(i - 1) + " ");
            }
        }
    }
}
