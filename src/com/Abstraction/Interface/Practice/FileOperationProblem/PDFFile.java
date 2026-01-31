package com.Abstraction.Interface.Practice.FileOperationProblem;

public class PDFFile implements FileOperation {
    @Override
    public void readFile() {
        System.out.println("\nReading PDF file");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing to PDF file");
    }

    @Override
    public void deleteFile() {
        System.out.println("Deleting PDF file");
    }
}
