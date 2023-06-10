package org.example.FileIO;

import java.io.File;

public class myMain {
    public static void main(String[] args) {
        String path = "/Users/NyQuil/Desktop/testingFile.txt" ;

        File f = new  File(path);
        System.out.println("File Name: " + f.getName());
        System.out.println("File Path: " + f.getPath());
        System.out.println("Is path absolute: " + f.isAbsolute());
        System.out.println("Return Absolute path of the File: " + f.getAbsolutePath());
        System.out.println("Return Parent folder of the given File: " + f.getParent());
        System.out.println("Does file exist: " + f.exists());
        System.out.println(f.exists() ? "Yes file exists" : "file does not exists");
        if(f.exists()) // return true or false
        {
            System.out.println("File is Found");
            System.out.println("Is file readable: " + f.canRead());
            System.out.println("Is file Writable: " + f.canWrite() );
            System.out.println("File size in bytes: " + f.length());// file size in byte
        }
    }
}
