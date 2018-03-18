package com.course;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class InfoReader {

    public ArrayList<String> readFile(String filePath) {
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            //Iterate through the stream, adding each element to the arraylist via lambda
            ArrayList<String> contents = new ArrayList<>();
            stream.forEach(contents::add);
            return contents;

        } catch (IOException e) {
            System.out.println("Error; file does not exist.");
        }
        // if failure:
        return null;
    }

}
