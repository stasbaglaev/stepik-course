package stepik.basiccourse.all.filesystemaccess51;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        File file5 = new File("a\\..\\b\\c\\file.txt");
        System.out.println(file5.getCanonicalFile());

        File file4 = new File(".\\a\\b\\..\\b\\c\\.\\file.txt");
        System.out.println(file4.getCanonicalFile());

        File file3 = new File("a\\.\\b\\..\\c\\.\\file.txt");
        System.out.println(file3.getCanonicalFile());

        File file1 = new File("a\\b\\c\\file.txt");
        System.out.println(file1.getCanonicalFile());

        File file2 = new File("a\\b\\..\\file.txt");
        System.out.println(file2.getCanonicalFile());






    }
}
