package com.jsn.core.java.oops.abstraction.reader;

public class BadMiitFileReader {


    void readFile(String filePath) {
        System.out.println("Reading file: " + filePath);

        if (filePath == null || filePath.isEmpty()) {
            System.out.println("Invalid file path.");
            return;
        }

        if(filePath.endsWith(".txt")) {
            System.out.println("File content: [This is a sample text file content.]");
        } else if (filePath.endsWith(".pdf")) {
            System.out.println("File content: [This is a sample PDF file content.]");
        } else if (filePath.endsWith(".mp4")) {
             System.out.println("File content: [This is a sample MP4 file content.]");
        } else {
            System.out.println("Unsupported file format.");
        }
    }
}
