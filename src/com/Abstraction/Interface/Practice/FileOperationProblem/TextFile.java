package com.Abstraction.Interface.Practice.FileOperationProblem;

public class TextFile implements FileOperation {


    @Override
    public void readFile() {
        System.out.println("\nReading Text file");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing Text file");
    }

    @Override
    public void deleteFile() {
        System.out.println("Deleting Text file");
    }
}
