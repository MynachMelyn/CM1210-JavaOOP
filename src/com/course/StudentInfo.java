package com.course;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentInfo {
    // fields
    private String name, studentID, courseName, courseID, houseNumber, streetName, town, postcode;
    private ArrayList<String> info;


    // methods
    public StudentInfo() {
        info = new ArrayList<>();
        info.add(name);
        info.add(studentID);
        info.add(courseName);
        info.add(courseID);
        info.add(houseNumber);
        info.add(streetName);
        info.add(town);
        info.add(postcode);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        final Pattern pattern = Pattern.compile("[A-Za-z ]{1,16}");
        if(!pattern.matcher(name).matches()) {
            displayError("Invalid input for student name.");
        } else {
            this.name = name;
        }
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        final Pattern pattern = Pattern.compile("[Cc]{1}[\\d]{6}");
        if(!pattern.matcher(studentID).matches()) {
            displayError("Invalid input for student ID.");
        } else {
            this.studentID = studentID;
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        final Pattern pattern = Pattern.compile("[A-Za-z ]{1,}");
        if(!pattern.matcher(courseName).matches()) {
            displayError("Invalid input for course name.");
        } else {
            this.courseName = courseName;
        }
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        final Pattern pattern = Pattern.compile("[A-Za-z]{2}[\\d]{4}");
        if(!pattern.matcher(courseID).matches()) {
            displayError("Invalid input for course ID.");
        } else {
            this.courseID = courseID;
        }
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        final Pattern pattern = Pattern.compile("[\\d]+[A-Za-z]*");
        if(!pattern.matcher(houseNumber).matches()) {
            displayError("Invalid input for house number.");
        } else {
            this.houseNumber = houseNumber;
        }
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        final Pattern pattern = Pattern.compile("[ßA-Za-z ]+");
        if(!pattern.matcher(streetName).matches()) {
            displayError("Invalid input for street name.");
        } else {
            this.streetName = streetName;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        final Pattern pattern = Pattern.compile("[A-Za-z ]+");
        if(!pattern.matcher(town).matches()) {
            displayError("Invalid input for town name.");
        } else {
            this.town = town;
        }
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        final Pattern pattern = Pattern.compile("[A-Z]{2}\\d{1}[A-Z]{2}");
        if(!pattern.matcher(postcode).matches()) {
            displayError("Invalid input for postcode.");
        } else {
            this.postcode = postcode;
        }
    }

    private void displayError(String message){
        System.out.println(message);
    }
}
