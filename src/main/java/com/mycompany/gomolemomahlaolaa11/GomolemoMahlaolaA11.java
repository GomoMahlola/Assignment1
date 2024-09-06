/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gomolemomahlaolaa11;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class GomolemoMahlaolaA11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentManagements management = new StudentManagements();

        while (true) {
            System.out.println("STUDENT MANAGEMENT APPLICATION");
            System.out.println("Enter (1) to launch menu or any other key to exit");

            String input = scanner.nextLine();
            if (!input.equals("1")) {
                System.out.println("Exiting application...");
                break;
            }

            System.out.println("Please select one of the following menu items:");
            System.out.println("1. Capture a new student.");
            System.out.println("2. Search for a student.");
            System.out.println("3. Delete a student.");
            System.out.println("4. Print student report.");
            System.out.println("5. Exit Application.");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    management.saveStudent();
                    
                    break;
                case 2:
                    int studentID = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Student ID to search"));
                   boolean studentsearchresult =  management.searchStudent(studentID);
                   if(studentsearchresult){
                       System.out.println("Found " + studentID);
                   }else{
                       System.out.println("Student with Student Id: " + studentID + " was not found!");
                   }
                    break;
                case 3:
                    management.deleteStudent();
                    break;
                case 4:
                    management.studentReport();
                    break;
                case 5:
                    management.exitStudentApplication();
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }

            System.out.println("Enter (1) to launch menu or any other key to exit");
            input = scanner.nextLine();
            if (!input.equals("1")) {
                System.out.println("Exiting application...");
                break;
            }
        }

        scanner.close();
    }

}
