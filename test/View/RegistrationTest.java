/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Galib
 */
public class RegistrationTest {
    
    public RegistrationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of courses method, of class Registration.
     */
    @Test
    public void testCourses() {
        System.out.println("courses");
        Registration instance = new Registration();
        instance.courses();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of batch method, of class Registration.
     */
    @Test
    public void testBatch() {
        System.out.println("batch");
        Registration instance = new Registration();
        instance.batch();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Registration.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Registration.main(args);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
