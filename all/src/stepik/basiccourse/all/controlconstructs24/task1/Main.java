package stepik.basiccourse.all.controlconstructs24.task1;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static BigInteger factorial(int value) {
        //рекурсивный способ. Когда в методе происходит вызов самого себя
        return value == 0 ? BigInteger.ONE : BigInteger.valueOf(value).multiply(factorial(value - 1));
    }
//    public static BigInteger factorial(int value) {
//        BigInteger result = BigInteger.valueOf(1);
//        for (int i = 2; i <= Math.abs(value); i++) {
//            result = result.multiply(BigInteger.valueOf(i));
//        }
//        return result;
//    }
}
