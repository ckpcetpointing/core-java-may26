package com.jsn.core.java.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileLineStreamDemo {


    public static void main(String[] args) throws IOException {

        ArrayList<Student> studentArrayList = Files.lines(Path.of("C:\\Users\\Vijay\\code\\core-java-may26\\src\\main\\java\\com\\jsn\\core\\java\\stream\\StudentLanguage.txt"))
                .filter(line -> line != null && !line.isEmpty() && line.split(",").length == 3)
                .map(line -> {
                    String[] record = line.split(",");
                    return new Student(Integer.parseInt(record[0]), record[1], record[2]);
                }).filter(student -> student.getLanguage().trim().equals("Java"))
                .collect(Collectors.toCollection(ArrayList::new));

        studentArrayList.forEach(s -> System.out.println(s.getName()+"="+s.getLanguage()));

    }



}
