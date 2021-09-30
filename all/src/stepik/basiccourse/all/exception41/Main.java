package stepik.basiccourse.all.exception41;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        test(b);
    }
    static void test(Object obj){
        B b = new B();
        A a = (A) obj;
    }
}
