package com.Abstraction.Interface.Practice.FileOperationProblem;

public class FileAdmin {

    public static void main(String[] args) {
        System.out.println("\n--------------------Text File-------------------");
        FileOperation f1 = new TextFile();
        f1.readFile();
        f1.writeFile();
        f1.deleteFile();
        System.out.println("\n--------------------PDF File-------------------");
        FileOperation f2 = new PDFFile();
        f2.readFile();
        f2.writeFile();
        f2.deleteFile();
        System.out.println("\n--------------------CSV File-------------------");
        FileOperation f3 = new CSVFile();
        f3.readFile();
        f3.writeFile();
        f3.deleteFile();
    }
}
