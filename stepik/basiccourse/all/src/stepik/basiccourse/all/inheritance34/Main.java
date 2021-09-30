package stepik.basiccourse.all.inheritance34;

public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        System.out.println("hashCode a " + a.hashCode());
        System.out.println("hashCode b " + b.hashCode());
        System.out.println("a.equals(b) " + a.equals(b));
        System.out.println("b.equals(a) " + b.equals(a));
    }

}
