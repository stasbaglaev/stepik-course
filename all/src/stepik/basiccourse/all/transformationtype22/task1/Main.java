package stepik.basiccourse.all.transformationtype22.task1;

public class Main {
    public static void main(String[] args) {
        System.out.println(charExpression(1));
    }

    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }
}
