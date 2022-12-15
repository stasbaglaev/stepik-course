package stepik.basiccourse.all.symbolsstreams53.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sum = 0.0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            try {
                sum += Double.parseDouble(scanner.next());
            } catch (NumberFormatException e) {
                sum += 0.0;
            }
        }
        System.out.printf("%.6f", sum);
    }
}