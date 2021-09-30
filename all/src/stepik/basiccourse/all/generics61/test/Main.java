package stepik.basiccourse.all.generics61.test;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SomeType st = new SomeType<>();
        List<String> list = Arrays.asList("test");
        st.test(list);
    }
}
