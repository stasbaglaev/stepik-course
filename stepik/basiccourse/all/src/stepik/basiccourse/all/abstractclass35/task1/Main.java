package stepik.basiccourse.all.abstractclass35.task1;

import java.util.function.DoubleUnaryOperator;

public class Main {
    public static void main(String[] args) {
        double a = 0.0;
        double b = 10.0;

        System.out.println(integrate(x -> 1, a, b));

    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double h = 1e-6;
        double result = 0;
        double n = (b - a) / h;
        for (int i = 0; i < n; i++) {
            result += f.applyAsDouble(a + h / 2 + i * h);
        }
        result *= h;
        return result;
    }
}