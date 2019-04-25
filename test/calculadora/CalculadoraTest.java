/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;


import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



/**
 *
 * @author informatica Ruiz Gijón
 */

@RunWith (value = Parameterized.class)

public class CalculadoraTest {
    
   private double numero1;
   private double numero2;
   private double expResult;
    
    public CalculadoraTest(double numero1, double numero2, double expResult) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.expResult = expResult;
    }
    
    
    @Parameters
  public static Collection<Object[]> data() {
    Object[][] data = new Object[][] { {6,2,8}, {8,2,10}, {10,2,12} } ;
    return Arrays.asList(data);
  }
    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        //double numero1 = 6;
        //double numero2 = 2;
        //double expResult = 8;
        Calculadora instance= new Calculadora();
        double result = instance.suma(numero1, numero2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
