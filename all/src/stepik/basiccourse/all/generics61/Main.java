package stepik.basiccourse.all.generics61;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Pair<Integer,String> pair1 = Pair.of(null,"Hello");
        Integer i = pair1.getFirst();
        String s = pair1.getSecond();

        Pair<Integer,String> pair2 = Pair.of(1,"Hello");
        boolean mustBeTrue = pair1.equals(pair2);
        boolean mustAlsoBeTrue = pair1.hashCode() == pair2.hashCode();

        System.out.println(mustBeTrue);
        System.out.println(mustAlsoBeTrue);
    }
}
