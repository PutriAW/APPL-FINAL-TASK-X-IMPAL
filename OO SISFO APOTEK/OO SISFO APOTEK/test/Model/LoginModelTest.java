/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PUTRI
 */
public class LoginModelTest {
    
    public LoginModelTest() {
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
     * Test of getUsername method, of class LoginModel.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        LoginModel instance = new LoginModel("PutriCan","mercyOnMe");
        String expResult = "PutriCan";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsername method, of class LoginModel.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        LoginModel instance = new LoginModel("PutriCan","mercyOnMe");
        instance.setUsername(username);
    }

    /**
     * Test of getPassword method, of class LoginModel.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        LoginModel instance = new LoginModel("PutriCan","mercyOnMe");
        String expResult = "mercyOnMe";
        String result = instance.getPassword();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setPassword method, of class LoginModel.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        LoginModel instance = new LoginModel("PutriCan","mercyOnMe");
        instance.setPassword(password);
    }
    
}
