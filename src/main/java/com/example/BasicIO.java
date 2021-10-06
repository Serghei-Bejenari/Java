package com.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BasicIO {
    public static void main(
            String[] args) throws IOException {

        FileInputStream input = null;
        FileOutputStream output = null;

        try {
            input = new FileInputStream("src/main/resources/text.txt");
            output = new FileOutputStream("src/main/resources/newText.txt");

            // Reading source file and writing
            // content to target file byte by byte
            int temp;
            while ((temp = input.read()) != -1)
                output.write((byte) temp);
        } finally {

//            close input stream
            if (input != null)
                input.close();

//            close output stream
            if (output != null)
                output.close();
        }
    }
}
