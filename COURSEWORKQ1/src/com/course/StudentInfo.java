package com.course;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentInfo {
    // fields
    private StringBuffer name = new StringBuffer(""), studentID = new StringBuffer(""),
            courseName = new StringBuffer(""), courseID = new StringBuffer(""),
            houseNumber = new StringBuffer(""), streetName = new StringBuffer(""),
            town = new StringBuffer(""), postcode = new StringBuffer("");
    private ArrayList<StringBuffer> info;


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
        return name.toString();
    }

    public void setName(String name) throws IOException {
        final Pattern pattern = Pattern.compile("[A-Za-z ]{1,16}");
        if(!pattern.matcher(name).matches()) {
            displayError("Invalid input for student name. " + name);
            for (char ch : name.toCharArray()) {
                System.out.println((int) ch);
            }
        } else {
            this.name.delete(0, name.length());
            this.name.append(name);
        }
    }

    public String getStudentID() {
        return studentID.toString();
    }

    public void setStudentID(String studentID) throws IOException {
        final Pattern pattern = Pattern.compile("[Cc]{1}[\\d]{6}");
        if(!pattern.matcher(studentID).matches()) {
            displayError("Invalid input for student ID. " + studentID);
        } else {
            this.studentID.delete(0, studentID.length());
            this.studentID.append(studentID);
        }
    }

    public String getCourseName() {
        return courseName.toString();
    }

    public void setCourseName(String courseName) throws IOException {
        final Pattern pattern = Pattern.compile("[A-Za-z ]{1,}");
        if(!pattern.matcher(courseName).matches()) {
            displayError("Invalid input for course name. " + courseName);
        } else {
            this.courseName.delete(0, courseName.length());
            this.courseName.append(courseName);
        }
    }

    public String getCourseID() {
        return courseID.toString();
    }

    public void setCourseID(String courseID) throws IOException {
        final Pattern pattern = Pattern.compile("[A-Za-z]{2}[\\d]{4}");
        if(!pattern.matcher(courseID).matches()) {
            displayError("Invalid input for course ID. " + courseID);
        } else {
            this.courseID.delete(0, courseID.length());
            this.courseID.append(courseID);
        }
    }

    public String getHouseNumber() {
        return houseNumber.toString();
    }

    public void setHouseNumber(String houseNumber) throws IOException {
        final Pattern pattern = Pattern.compile("[\\d]+[A-Za-z]*");
        if(!pattern.matcher(houseNumber).matches()) {
            displayError("Invalid input for house number. " + houseNumber);
        } else {
            this.houseNumber.delete(0, houseNumber.length());
            this.houseNumber.append(houseNumber);        }
    }

    public String getStreetName() {
        return streetName.toString();
    }

    public void setStreetName(String streetName) throws IOException {
        final Pattern pattern = Pattern.compile("[ßA-Za-z ]+");
        if(!pattern.matcher(streetName).matches()) {
            displayError("Invalid input for street name. " + streetName);
        } else {
            this.streetName.delete(0, streetName.length());
            this.streetName.append(streetName);
        }
    }

    public String getTown() {
        return town.toString();
    }

    public void setTown(String town) throws IOException {
        final Pattern pattern = Pattern.compile("[A-Za-z ]+");
        if(!pattern.matcher(town).matches()) {
            displayError("Invalid input for town name. " + town);
        } else {
            this.town.delete(0, town.length());
            this.town.append(town);
        }
    }

    public String getPostcode() {
        return postcode.toString();
    }

    public void setPostcode(String postcode) throws IOException {
        final Pattern pattern = Pattern.compile("[A-Z]{2}\\d{1}[A-Z]{2}");
        if(!pattern.matcher(postcode).matches()) {
            displayError("Invalid input for postcode. " + postcode);
        } else {
            this.postcode.delete(0, postcode.length());
            this.postcode.append(postcode);        }
    }

    private void displayError(String message) throws IOException {
        System.out.println(message);
        throw new IOException("Invalid input. Exception raised.");
    }

    public  ArrayList<StringBuffer> getInfo(){
        return info;
    }
}
