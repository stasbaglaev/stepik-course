package stepik.basiccourse.all.transformationtype22.task2;

public class Main {
    public static void main(String[] args) {
        int a = 32;
        System.out.println(isPowerOfTwo(a));
        System.out.println(Integer.bitCount(a));
    }
    public static boolean isPowerOfTwo(int value) {
        return (Integer.bitCount(Math.abs(value)) == 1);
    }
}
