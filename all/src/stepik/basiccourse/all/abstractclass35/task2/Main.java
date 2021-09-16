package stepik.basiccourse.all.abstractclass35.task2;

public class Main {
    public static void main(String[] args) {
        byte[] array = {'1', '2', '3', '4'};

        AsciiCharSequence charSequence = new AsciiCharSequence(array);
        System.out.println(charSequence.length());
        System.out.println(charSequence.charAt(3));
        System.out.println(charSequence.toString());
        System.out.println(charSequence.subSequence(1, 2));
    }
}
