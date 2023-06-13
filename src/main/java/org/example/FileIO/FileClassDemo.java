package org.example.FileIO;

import java.io.File;
import java.io.IOException;

public class FileClassDemo {
    public static void main(String[] args) {
        try {
            File f = new File("/Users/NyQuil/Desktop/IntelliJDataFile.txt");
            if (f.createNewFile()) {
                System.out.println("New File created");
            } else {
                System.out.println(("The fil already exists. "));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}