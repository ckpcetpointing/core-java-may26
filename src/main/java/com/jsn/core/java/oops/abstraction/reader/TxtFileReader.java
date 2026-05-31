package com.jsn.core.java.oops.abstraction.reader;

public class TxtFileReader extends MiitFileReader {

    TxtFileReader(String filePath) {
        super(filePath);
    }

    @Override
    void readFile() {
        if (validateFile()) {
            // Logic to read the .txt file
            System.out.println("Reading .txt file: " + getFilePath());
            // Simulate reading the file content
            System.out.println("File content: [This is a sample text file content.]");
        }
    }
}
