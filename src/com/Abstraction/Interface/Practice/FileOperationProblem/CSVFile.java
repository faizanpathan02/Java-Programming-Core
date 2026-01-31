package com.Abstraction.Interface.Practice.FileOperationProblem;

public class CSVFile implements  FileOperation {
    @Override
    public void readFile() {
        System.out.println("\nReading CSV file");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing to CSV file");
    }

    @Override
    public void deleteFile() {
        System.out.println("Deleting CSV file");
    }
}
