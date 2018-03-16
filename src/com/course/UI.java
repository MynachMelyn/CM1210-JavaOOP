package com.course;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UI {
    public void mainLoop() {
        Database database = new Database();
        String[] commands = {""};
        Scanner s = new Scanner(System.in);

        while(!commands[0].contains("exit")) {
            System.out.println("Enter command: \n");
            commands = s.nextLine().split("\\s+");

            switch (commands[0].toLowerCase()) {
                case "load":
                    if(commands.length > 1) {
                        if (commands[1].matches("[^\\/\\\\]+\\.(bin|txt)")) {
                            database.readFile(commands[1]);
                        } else {
                            System.out.println("A file ending in .txt or .bin must be specified.");
                        }
                    } else {
                        System.out.println("A file path must be specified.");
                    }
                    break;

                case "display":
                    if(commands.length == 4) {
                        if(commands[1].matches("\\d+") && commands[3].matches("\\d+") && commands[2].toLowerCase() == "to") {
                            // display X to Y indices
                        }
                    } else if (commands.length == 3) {
                        switch (commands[1]) {
                            case "course":
                                for(StudentInfo info : database.getStudentList()) {
                                    if(info.getCourseName().toLowerCase().equals(commands[2].toLowerCase())) {
                                        System.out.println("==============================");
                                        for(StringBuffer item : info.getInfo()){
                                            System.out.println(item);
                                        }
                                        System.out.println("==============================");
                                    }
                                }
                                break;
                            case "house":
                                for(StudentInfo info : database.getStudentList()) {
                                    if(info.getHouseNumber().toLowerCase().equals(commands[2].toLowerCase())) {
                                        System.out.println("==============================");
                                        for(StringBuffer item : info.getInfo()){
                                            System.out.println(item);
                                        }
                                        System.out.println("==============================");
                                    }
                                }
                                break;
                            case "street":
                                for(StudentInfo info : database.getStudentList()) {
                                    if(info.getStreetName().toLowerCase().equals(commands[2].toLowerCase())) {
                                        System.out.println("==============================");
                                        for(StringBuffer item : info.getInfo()){
                                            System.out.println(item);
                                        }
                                        System.out.println("==============================");
                                    }
                                }
                                break;
                            case "town":
                                for(StudentInfo info : database.getStudentList()) {
                                    if(info.getTown().toLowerCase().equals(commands[2].toLowerCase())) {
                                        System.out.println("==============================");
                                        for(StringBuffer item : info.getInfo()){
                                            System.out.println(item);
                                        }
                                        System.out.println("==============================");
                                    }
                                }
                                break;
                            case "postcode":
                                for(StudentInfo info : database.getStudentList()) {
                                    if(info.getPostcode().toLowerCase().equals(commands[2].toLowerCase())) {
                                        System.out.println("==============================");
                                        for(StringBuffer item : info.getInfo()){
                                            System.out.println(item);
                                        }
                                        System.out.println("==============================");
                                    }
                                }
                                break;
                            default:
                                break;
                        }
                    } else {
                        for(StudentInfo info : database.getStudentList()) {
                            for(StringBuffer item : info.getInfo()){
                                System.out.println(item);
                            }
                            System.out.println("==============================");
                        }
                    }
                    break;
                case "create":
                    if(commands.length == 2){
                        // create file with commands[1]
                    }
                    break;
                case "add":
                    StudentInfo tempStudent = new StudentInfo();
                    try {
                        System.out.println("Enter name:");
                        tempStudent.setName(s.nextLine());
                        System.out.println("Enter student ID:");
                        tempStudent.setStudentID(s.nextLine());
                        System.out.println("Enter course name:");
                        tempStudent.setCourseName(s.nextLine());
                        System.out.println("Enter course ID:");
                        tempStudent.setCourseID(s.nextLine());
                        System.out.println("Enter house number:");
                        tempStudent.setHouseNumber(s.nextLine());
                        System.out.println("Enter street:");
                        tempStudent.setStreetName(s.nextLine());
                        System.out.println("Enter town:");
                        tempStudent.setTown(s.nextLine());
                        System.out.println("Enter postcode:");
                        tempStudent.setPostcode(s.nextLine());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    database.addStudent(tempStudent.getInfo().toArray(new String[tempStudent.getInfo().size()]));
                    break;
                case "delete":
                    if(commands.length > 1) {
                        if(commands[1].matches("\\d+")){
                            // delete at commands[1]
                            database.getStudentList().remove((int) Integer.getInteger(commands[1]));
                        }
                    }
            }
        }
    }
}
