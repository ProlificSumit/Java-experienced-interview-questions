package com.learn.exception;

import java.io.*;

public class TryCatchFinallyTest {

    public static void main(String[] args) {
        File testFile = new File("src/files/test.txt");
        try {
            FileReader reader = new FileReader(testFile);
            try (BufferedReader bReader = new BufferedReader(reader)) {
                String line = null;
                while ((line = bReader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
