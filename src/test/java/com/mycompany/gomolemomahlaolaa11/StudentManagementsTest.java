/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.gomolemomahlaolaa11;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class StudentManagementsTest {

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of saveStudent method, of class StudentManagements.
     */
    @Test
    public void testSaveStudent() {
        System.out.println("saveStudent");
        StudentManagements instance = new StudentManagements();
        instance.saveStudent();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of searchStudent method, of class StudentManagements.
     */
    @Test
    public void testSearchStudent() {
        System.out.println("searchStudent");
        StudentManagements instance = new StudentManagements();
        instance.searchStudent(16);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteStudent method, of class StudentManagements.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        StudentManagements instance = new StudentManagements();
        instance.deleteStudent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of studentReport method, of class StudentManagements.
     */
    @Test
    public void testStudentReport() {
        System.out.println("studentReport");
        StudentManagements instance = new StudentManagements();
        instance.studentReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exitStudentApplication method, of class StudentManagements.
     */
    @Test
    public void testExitStudentApplication() {
        System.out.println("exitStudentApplication");
        StudentManagements instance = new StudentManagements();
        instance.exitStudentApplication();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
    }
    
}
