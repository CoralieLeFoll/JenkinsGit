/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testunitaire;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author coralie
 */
public class TestUnitaireTest {
    
    public TestUnitaireTest() {
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
     * Test of add method, of class TestUnitaire.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int n1 = 0;
        int n2 = 0;
        int expResult = 0;
        int result = TestUnitaire.add(n1, n2);
        assertEquals("error in add()", 5, TestUnitaire.add(3,2));
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of divInt method, of class TestUnitaire.
     */
    @Test
    public void testDivInt() {
        System.out.println("divInt");
        int n1 = 0;
        int n2 = 0;
        int expResult = 5;
        int result = TestUnitaire.divInt(10, 2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of divReal method, of class TestUnitaire.
     */
    @Test
    public void testDivReal() {
        System.out.println("divReal");
        int n1 = 0;
        int n2 = 0;
        double expResult = 2.5;
        double result = TestUnitaire.divReal(5, 2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
