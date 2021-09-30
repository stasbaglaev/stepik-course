package stepik.basiccourse.all.bytestreams52.task2;

import java.io.*;

public class Main {

//Для отладки:
//    public static void main(String[] args) throws IOException {
//        byte[] data = {13, 13, 10};
//        InputStream inputStream = new ByteArrayInputStream(data);
//        System.setIn(inputStream);
//        int read = System.in.read();
//        while (read > 0) {
//            if (read == 13) {
//                // System.out.println("read= " + read);
//                int buf = System.in.read();
//                if (buf == 10) {
//                    System.out.println("Hi " + buf);
//                    read = System.in.read();
//                } else {
//                    System.out.println("Я тут " + read);
//                    read = buf;
//                }
//            } else {
//                System.out.println("Val " + read);
//                read = System.in.read();
//            }
//        }
//        System.out.flush();
//    }

    //Для проверяющей системы на степике (мое первое решение):
    public static void main(String[] args) throws IOException {
        int read = System.in.read();
        while (read > 0) {
            if (read == 13) {
                int buf = System.in.read();
                if (buf == 10) {
                    System.out.write(buf);
                    read = System.in.read();
                } else {
                    System.out.write(read);
                    read = buf;
                }
            } else {
                System.out.write(read);
                read = System.in.read();
            }
        }
        System.out.flush();
    }

    //Для проверяющей системы на степике (мое второе решение с использованием чужих решений):
//    public static void main(String[] args) throws IOException {
//        int first = System.in.read();
//        int next;
//        while (first != -1) {
//            next = System.in.read();
//            if (!(first == 13 && next == 10)) {
//                System.out.println(first);
//                System.out.write(first);
//            }
//            first = next;
//        }
//        System.out.flush();
//    }
}