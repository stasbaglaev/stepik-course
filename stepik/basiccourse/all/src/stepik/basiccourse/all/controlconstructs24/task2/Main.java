package stepik.basiccourse.all.controlconstructs24.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a1 = new int[]{0, 2, 2};
        int[] a2 = new int[]{1, 3};
        System.out.println(Arrays.toString(mergeArrays(a1, a2)));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        if (a1 == null) {
            return a2;
        }
        if (a2 == null) {
            return a1;
        }
        int[] r = new int[a1.length + a2.length];
        System.arraycopy(a1, 0, r, 0, a1.length);
        System.arraycopy(a2, 0, r, a1.length, a2.length);
        return Arrays.stream(r).sorted().toArray();
    }
}
