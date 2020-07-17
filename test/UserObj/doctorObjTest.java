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
public class doctorObjTest {
    
    public doctorObjTest() {
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
     * Test of getClearance method, of class doctorObj.
     */
    @Test
    public void testGetClearance() {
        System.out.println("getClearance");
        doctorObj instance = new doctorObjImpl();
        String expResult = "";
        String result = instance.getClearance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class doctorObj.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        doctorObj instance = new doctorObjImpl();
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClearance method, of class doctorObj.
     */
    @Test
    public void testSetClearance() {
        System.out.println("setClearance");
        String clearance = "";
        doctorObj instance = new doctorObjImpl();
        instance.setClearance(clearance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class doctorObj.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        int ID = 0;
        doctorObj instance = new doctorObjImpl();
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class doctorObjImpl extends doctorObj {
    }
    
}
