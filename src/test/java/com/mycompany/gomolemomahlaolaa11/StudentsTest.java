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
public class StudentsTest {

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
     * Test of getId method, of class Students.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Students instance = new Students(12,"Gomolemo",16,"email","DISD");
        int expResult = 12;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Students.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Students instance = new Students(12,"Gomolemo",16,"email","DISD");
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Students.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Students instance = new Students(12,"Gomolemo",16,"email","DISD");
        int expResult = 16;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Students.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Students instance =new Students(12,"Gomolemo",16,"email","DISD");
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourse method, of class Students.
     */
    @Test
    public void testGetCourse() {
        System.out.println("getCourse");
        Students instance = new Students(12,"Gomolemo",16,"email","DISD");
        String expResult = "";
        String result = instance.getCourse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Students.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Students instance = new Students(12,"Gomolemo",16,"email","DISD");
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
