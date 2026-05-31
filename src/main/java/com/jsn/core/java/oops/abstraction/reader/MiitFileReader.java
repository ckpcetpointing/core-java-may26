package com.jsn.core.java.oops.abstraction.reader;


import lombok.Getter;


public abstract class MiitFileReader {

    private String filePath;


    String getFilePath() {
        return filePath;
    }
    MiitFileReader(String f){
            this.filePath = f;
    }
    boolean validateFile() {
        // Logic to validate the file path and format
        System.out.println("Validating file: " + filePath);
        if(filePath == null || filePath.isEmpty()) {
            System.out.println("Invalid file path.");
            return false;
        } else if (!filePath.endsWith(".txt")) {
            System.out.println("Unsupported file format. Only .txt files are allowed.");
            return false;
        } else {
            System.out.println("File is valid.");
            return true;
        }
    }

    abstract void  readFile() ;
}
