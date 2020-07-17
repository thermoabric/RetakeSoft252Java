/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserObj;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Block
 */
public class secretaryObjTest {
    
    public secretaryObjTest() {
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
     * Test of getClearance method, of class secretaryObj.
     */
    @Test
    public void testGetClearance() {
        System.out.println("getClearance");
        secretaryObj instance = new secretaryObjImpl();
        String expResult = "";
        String result = instance.getClearance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class secretaryObj.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        secretaryObj instance = new secretaryObjImpl();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClearance method, of class secretaryObj.
     */
    @Test
    public void testSetClearance() {
        System.out.println("setClearance");
        String clearance = "";
        secretaryObj instance = new secretaryObjImpl();
        instance.setClearance(clearance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class secretaryObj.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        secretaryObj instance = new secretaryObjImpl();
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class secretaryObjImpl extends secretaryObj {
    }
    
}
