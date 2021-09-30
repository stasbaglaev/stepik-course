package stepik.basiccourse.all.bytestreams52.task1;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        byte[] data = {0x33, 0x45, 0x01};
        byte[] datas = {0};
        System.out.println(Arrays.toString(data));
        InputStream inputStream = new ByteArrayInputStream(data);

        System.out.println(checkSumOfStream(inputStream));
    }


    //первый вариант решения задачи
//    public static int checkSumOfStream(InputStream inputStream) throws IOException {
//        int read = inputStream.read();
//        int controlSum = 0;
//        while (read != -1) {
//            controlSum = Integer.rotateLeft(controlSum, 1) ^ read;
//            read = inputStream.read();
//        }
//        return controlSum;
//    }


    //второй вариант решения задачи
    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int controlSum = 0;
        for (int read = 0; read != -1; read = inputStream.read()) {
            controlSum = Integer.rotateLeft(controlSum, 1) ^ read;
        }
        return controlSum;
    }
}
