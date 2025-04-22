package org.work.io.buffered;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.work.io.buffered.BufferedConst.*;

public class ReadFileV1 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        long startTime = System.currentTimeMillis();

        int fileSize = 0;
        int data;
        while ((data = fis.read()) != -1) {
            fileSize++;
        }

        long endTime = System.currentTimeMillis();
        System.out.println("File Created : "  + FILE_NAME);
        System.out.println("File size : "  + fileSize / 1024 / 1024 + "MB");
        System.out.println("File taken : " + (endTime - startTime) + "ms");

    }
}
