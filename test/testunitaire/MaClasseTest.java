/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testunitaire;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author coralie
 */

@RunWith(Parameterized.class)
public class MaClasseTest {
    int n1, n2, expResult;
   
    public MaClasseTest(int n1, int n2, int expResult) {
        this.n1 = n1;
        this.n2 = n2;
        this.expResult = expResult;
    }
    
    @Parameters
    public static Iterable<Object> data() {
            return Arrays.asList(
            new Object[] { 1, 2, 3 },
            new Object[] { 3, 4, 7 },
            new Object[] { -3, 2, -1 }
        );
    }
    
    @Test
    public void testAdd() {
        System.out.println("add");
        int result = TestUnitaire.add(n1, n2);
        assertEquals(expResult, TestUnitaire.add(n1,n2));
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
