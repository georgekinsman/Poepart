/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poepart;

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
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkpassword method, of class Login.
     */
    @Test
    public void testCheckpassword() {
        System.out.println("checkpassword");
        String password = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkpassword(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checknumber method, of class Login.
     */
    @Test
    public void testChecknumber() {
        System.out.println("checknumber");
        String number = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checknumber(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifyUsername method, of class Login.
     */
    @Test
    public void testVerifyUsername() {
        System.out.println("verifyUsername");
        String verifyUsername = "";
        String username = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.verifyUsername(verifyUsername, username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifyPassword method, of class Login.
     */
    @Test
    public void testVerifyPassword() {
        System.out.println("verifyPassword");
        String verifyPassword = "";
        String password = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.verifyPassword(verifyPassword, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifyCellphoneNumber method, of class Login.
     */
    @Test
    public void testVerifyCellphoneNumber() {
        System.out.println("verifyCellphoneNumber");
        String verifyCellphoneNumber = "";
        String cellphoneNumber = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.verifyCellphoneNumber(verifyCellphoneNumber, cellphoneNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class Login.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String username = "";
        String password = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.login(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
