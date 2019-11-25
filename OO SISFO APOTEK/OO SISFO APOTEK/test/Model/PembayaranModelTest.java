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
public class PembayaranModelTest {
    
    public PembayaranModelTest() {
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
     * Test of setIdPembayaran method, of class PembayaranModel.
     */
    @Test
    public void testSetIdPembayaran() {
        System.out.println("setIdPembayaran");
        String idPembayaran = "PMB0014";
        PembayaranModel instance = new PembayaranModel("PMB0014","PMS0014","KSR0003","2019-11-19",200000);
        instance.setIdPembayaran(idPembayaran);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal method, of class PembayaranModel.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        int total = 200000;
        PembayaranModel instance = new PembayaranModel("PMB0014","PMS0014","KSR0003","2019-11-19",200000);
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setTglPmbyr method, of class PembayaranModel.
     */
    @Test
    public void testSetTglPmbyr() {
        System.out.println("setTglPmbyr");
        String tglPmbyr = "2019-11-19";
        PembayaranModel instance = new PembayaranModel("PMB0014","PMS0014","KSR0003","2019-11-19",200000);
        instance.setTglPmbyr(tglPmbyr);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdPemesanan method, of class PembayaranModel.
     */
    @Test
    public void testSetIdPemesanan() {
        System.out.println("setIdPemesanan");
        String idPemesanan = "PMS0014";
        PembayaranModel instance = new PembayaranModel("PMB0014","PMS0014","KSR0003","2019-11-19",200000);
        instance.setIdPemesanan(idPemesanan);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdKasir method, of class PembayaranModel.
     */
    @Test
    public void testSetIdKasir() {
        System.out.println("setIdKasir");
        String idKasir = "KSR0003";
        PembayaranModel instance = new PembayaranModel("PMB0014","PMS0014","KSR0003","2019-11-19",200000);
        instance.setIdKasir(idKasir);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdPembayaran method, of class PembayaranModel.
     */
    @Test
    public void testGetIdPembayaran() {
        System.out.println("getIdPembayaran");
        PembayaranModel instance = new PembayaranModel("PMB0014","PMS0014","KSR0003","2019-11-19",200000);;
        String expResult = "PMB0014";
        String result = instance.getIdPembayaran();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdPemesanan method, of class PembayaranModel.
     */
    @Test
    public void testGetIdPemesanan() {
        System.out.println("getIdPemesanan");
        PembayaranModel instance = new PembayaranModel("PMB0014","PMS0014","KSR0003","2019-11-19",200000);
        String expResult = "PMS0014";
        String result = instance.getIdPemesanan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdKasir method, of class PembayaranModel.
     */
    @Test
    public void testGetIdKasir() {
        System.out.println("getIdKasir");
        PembayaranModel instance = new PembayaranModel("PMB0014","PMS0014","KSR0003","2019-11-19",200000);
        String expResult = "KSR0003";
        String result = instance.getIdKasir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class PembayaranModel.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        PembayaranModel instance = new PembayaranModel("PMB0014","PMS0014","KSR0003","2019-11-19",200000);
        int expResult = 200000;
        int result = instance.getTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getTglPmbyr method, of class PembayaranModel.
     */
    @Test
    public void testGetTglPmbyr() {
        System.out.println("getTglPmbyr");
        PembayaranModel instance = new PembayaranModel("PMB0014","PMS0014","KSR0003","2019-11-19",200000);
        String expResult = "2019-11-19";
        String result = instance.getTglPmbyr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
