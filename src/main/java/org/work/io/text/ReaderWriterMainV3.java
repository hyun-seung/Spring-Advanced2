package org.work.io.text;

import org.work.io.buffered.BufferedConst;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.work.io.buffered.BufferedConst.FILE_NAME;

public class ReaderWriterMainV3 {

    public static void main(String[] args) throws IOException {
        String writeString = "abc";
        System.out.println("write String : " + writeString);

        // 파일에 쓰기
        FileWriter fw = new FileWriter(FILE_NAME, StandardCharsets.UTF_8);
        fw.write(writeString);
        fw.close();

        // 파일에서 읽기
        StringBuilder content = new StringBuilder();
        FileReader fr = new FileReader(FILE_NAME, StandardCharsets.UTF_8);
        int ch;
        while ((ch = fr.read()) != -1) {
            content.append((char) ch);
        }
        fr.close();

        System.out.println("read String : " + content);
    }
}
