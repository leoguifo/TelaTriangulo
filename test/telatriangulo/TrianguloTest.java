/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telatriangulo;

import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leogu
 */
public class TrianguloTest {
    
    public TrianguloTest() {
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
     * Test of make method, of class Triangulo.
     */
    @Test
    public void testMake_0args() {
        System.out.println("make");
        Triangulo instance = new Triangulo();
        Triangulo expResult = null;
        Triangulo result = instance.make();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class Triangulo.
     */
    @Test
    public void testMake_3args() {
        System.out.println("make");
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        Triangulo instance = new Triangulo();
        Triangulo expResult = null;
        Triangulo result = instance.make(a, b, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHipotenusa method, of class Triangulo.
     */
    @Test
    public void testSetHipotenusa() {
        System.out.println("setHipotenusa");
        Triangulo instance = new Triangulo();
        Triangulo expResult = null;
        Triangulo result = instance.setHipotenusa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResultado method, of class Triangulo.
     */
    @Test
    public void testSetResultado() {
        System.out.println("setResultado");
        Triangulo instance = new Triangulo();
        Triangulo expResult = null;
        Triangulo result = instance.setResultado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printResultado method, of class Triangulo.
     */
    @Test
    public void testPrintResultado() {
        System.out.println("printResultado");
        Triangulo instance = new Triangulo();
        instance.printResultado();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResultado method, of class Triangulo.
     */
    @Test
    public void testGetResultado() {
        System.out.println("getResultado");
        Triangulo instance = new Triangulo();
        Set<String> expResult = null;
        Set<String> result = instance.getResultado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
