package stepik.basiccourse.all.primitivetype21;

public class Main {

    public static void main(String[] args) {
        System.out.println(doubleExpression(0.1,0.2,0.3));
    }
    public static boolean doubleExpression(double a, double b, double c) {
        System.out.println((float) (Math.abs(a) + Math.abs(b)));
        return ((float) (Math.abs(a) + Math.abs(b))) == (float) c;
    }
}
