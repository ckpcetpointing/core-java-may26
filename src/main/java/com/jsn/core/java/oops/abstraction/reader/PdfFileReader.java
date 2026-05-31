package com.jsn.core.java.oops.abstraction.reader;

public class PdfFileReader extends MiitFileReader {

    PdfFileReader(String filePath) {
        super(filePath);
    }

    @Override
    void readFile() {
        if (validateFile()) {
            // Logic to read the .pdf file
            System.out.println("Reading .pdf file: " + getFilePath());
            // Simulate reading the file content
            System.out.println("File content: [This is a sample PDF file content.]");
        }
    }
}
