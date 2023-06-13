package org.example.FileIO;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        try {
            File file = new File("/Users/NyQuil/Desktop/testingFile.txt");
            Scanner sc = new Scanner(file);
            String data = "";
            while (sc.hasNextLine()) {
                data = sc.nextLine();
                System.out.println(data);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("Either file is not found or file is not able to access");
            System.out.println(e.getStackTrace());
            e.printStackTrace();
        }
    }
}
