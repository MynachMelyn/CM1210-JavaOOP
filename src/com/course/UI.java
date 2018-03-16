package com.course;

import java.io.Console;
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
                        if (commands[1].toLowerCase() == "course") {
                            // display all elements with argument-3
                        }
                    } else {
                        // display all details
                    }
                    break;
                case "create":
                    if(commands.length == 2){
                        // create file with commands[1]
                    }
                    break;
                case "add":
                    if(commands.length == 9) {
                        // add student
                    } else {
                        System.out.println("Not enough parameters to add new student entry.");
                    }
            }
        }
    }
}
