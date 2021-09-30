package stepik.basiccourse.all.arraysstrings23;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }

    public static boolean isPalindrome(String text) {
        StringBuilder stringBuilder = new StringBuilder(text.replaceAll("[^a-zA-Z0-9]", "")).reverse();
        return text.replaceAll("[^a-zA-Z0-9]", "").equalsIgnoreCase(stringBuilder.toString());
    }
}
