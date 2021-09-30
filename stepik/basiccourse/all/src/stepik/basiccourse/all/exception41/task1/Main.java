package stepik.basiccourse.all.exception41.task1;

public class Main {
    public static void main(String[] args) {
        System.out.println(sqrt(10.2));
    }

    public static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException(String.format("Expected non-negative number, got %f", x));
        }
        return Math.sqrt(x);
    }
}
