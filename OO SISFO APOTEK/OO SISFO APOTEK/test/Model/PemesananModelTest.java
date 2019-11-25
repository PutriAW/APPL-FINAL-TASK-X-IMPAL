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
public class PemesananModelTest {
    
    public PemesananModelTest() {
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
     * Test of setIdPemesanan method, of class PemesananModel.
     */
    @Test
    public void testSetIdPemesanan() {
        System.out.println("setIdPemesanan");
        String idPemesanan = "PMS0015";
        PemesananModel instance = new PemesananModel("PMS0015",2,"2019-11-19");;
        instance.setIdPemesanan(idPemesanan);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal method, of class PemesananModel.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        int total = 2;
        PemesananModel instance = new PemesananModel("PMS0015",2,"2019-11-19");
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setTglPmsn method, of class PemesananModel.
     */
    @Test
    public void testSetTglPmsn() {
        System.out.println("setTglPmsn");
        String tglPmsn = "2019-11-19";
        PemesananModel instance = new PemesananModel("PMS0015",2,"2019-11-19");
        instance.setTglPmsn(tglPmsn);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdPemesanan method, of class PemesananModel.
     */
    @Test
    public void testGetIdPemesanan() {
        System.out.println("getIdPemesanan");
        PemesananModel instance = new PemesananModel("PMS0015",2,"2019-11-19");
        String expResult = "PMS0015";
        String result = instance.getIdPemesanan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class PemesananModel.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        PemesananModel instance = new PemesananModel("PMS0015",2,"2019-11-19");
        int expResult = 2;
        int result = instance.getTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getTglPmsn method, of class PemesananModel.
     */
    @Test
    public void testGetTglPmsn() {
        System.out.println("getTglPmsn");
        PemesananModel instance = new PemesananModel("PMS0015",2,"2019-11-19");
        String expResult = "2019-11-19";
        String result = instance.getTglPmsn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
