/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author a
 */
public class CatalogueDAOIT {
    
    public CatalogueDAOIT() {
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
     * Test of getItems method, of class CatalogueDAO.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        CatalogueDAO instance = new CatalogueDAO();
        List expResult = null;
        List result = instance.getItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsbyCat method, of class CatalogueDAO.
     */
    @Test
    public void testGetItemsbyCat() {
        System.out.println("getItemsbyCat");
        String cid = "";
        CatalogueDAO instance = new CatalogueDAO();
        List expResult = null;
        List result = instance.getItemsbyCat(cid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
