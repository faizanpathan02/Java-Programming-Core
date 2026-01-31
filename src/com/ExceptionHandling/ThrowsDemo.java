package com.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {

    public static void readFile() throws FileNotFoundException , IOException {

        File file = new File("data.txt");
        FileReader fileReader = new FileReader(file);
        fileReader.read();
    }

    public static void main(String[] args) {
        try {
            readFile();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
