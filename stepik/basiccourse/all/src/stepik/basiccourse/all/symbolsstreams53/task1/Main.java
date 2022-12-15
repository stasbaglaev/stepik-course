package stepik.basiccourse.all.symbolsstreams53.task1;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        byte[] array = {48, 49, 50, 51};

        ByteArrayInputStream inputStream = new ByteArrayInputStream(array);

        System.out.println(readAsString(inputStream, StandardCharsets.US_ASCII));

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        InputStreamReader isr = new InputStreamReader(inputStream, charset);
        StringWriter stringWriter = new StringWriter();
        int ch;
        while ((ch = isr.read()) != -1) {
            stringWriter.append((char) ch);
        }
        return stringWriter.toString();
    }
}
