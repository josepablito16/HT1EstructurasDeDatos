/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jose
 */
public class RadioTest 
{
    @org.junit.Test
    public void testSiguiente()
    {
        douglas x=new Radio();
        
        float resultado=x.siguiente((float) 87.9);
        float esperado=(float) 88.1;
        
        assertEquals(esperado,resultado,0.0);
         
    }
    
    @org.junit.Test
    public void testAnterior()
    {
        douglas x=new Radio();
        
        float resultado=x.anterior((float) 87.9);
        float esperado=(float) 107.9;
        
        assertEquals(esperado,resultado,0.0);
         
    }
    
    @org.junit.Test
    public void testGuardarYseleccionarFav()
    {
        douglas x=new Radio();
        
        x.guardar((float) 87.9,2);
        float resultado=x.seleccionarFav(2);
        float esperado=(float) 87.9;
        
        assertEquals(esperado,resultado,0.0);
         
    }
    
    
    
    
    
    public RadioTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
