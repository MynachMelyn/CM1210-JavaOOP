package com.course;

import java.util.ArrayList;

public class Database {

    private ArrayList<StudentInfo> studentList;
    private InfoWriter readerWriter;
    private final String assetFolder = "./textdateien/";
    private String loadedFile = null;

    public Database() {
        readerWriter = new InfoWriter();
        studentList = new ArrayList<>();
    }

    // loads student info to a list
    public void loadStudentInfo(){

    }

    /**
     * Displays all students matching the command. If no command is provided, all are shown.
     * @param command String command to be used as filter. Applicable to fields: Course Name, House Number, Street Name, Town, and Postcode.
     */
    public void displayStudentDetails(String command) {
        // format:
        // <field>:<string>
        // (not case sensitive)
    }

    public void deleteInfo(int index) {

    }

    public void addStudent(String[] info) {

    }

    public void readFile(String file) {
        ArrayList<String> content = readerWriter.readFile(assetFolder + file);
        studentList.clear();
        content.forEach(this::addToList);
        loadedFile = file;
    }

    private void addToList(String line) {
        StudentInfo info = new StudentInfo();
        String[] collection = line.split("\\|");
        if(collection.length == 8) {
            info.setName(collection[0]);
            info.setStudentID(collection[1]);
            info.setCourseName(collection[2]);
            info.setCourseID(collection[3]);
            info.setHouseNumber(collection[4]);
            info.setStreetName(collection[5]);
            info.setTown(collection[6]);
            info.setPostcode(collection[7]);
            studentList.add(info);
        } else {
            System.out.println("Error reading line; incorrect number of details interpreted.");
        }
    }

    private void saveFile() {
        // save file @ loadedFile
    }
}
