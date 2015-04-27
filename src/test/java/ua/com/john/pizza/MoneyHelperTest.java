/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.john.pizza;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Иван Бородай
 */
public class MoneyHelperTest {
    
    public MoneyHelperTest() {
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
     * Test of float2str method, of class MoneyHelper.
     */
    @Test
    public void testFloat2str() {
        System.out.println("float2str");
        
        assertEquals("0.00",  MoneyHelper.float2str(0.0F) );
        assertEquals("0.01",  MoneyHelper.float2str(0.01F) );
        assertEquals("1.00",  MoneyHelper.float2str(1F) );
    }

    /**
     * Test of str2float method, of class MoneyHelper.
     */
    @Test
    public void testStr2float() {
        System.out.println("str2float");
        
        assertEquals(0.0F, MoneyHelper.str2float(""), 0.0);
        assertEquals(0.0F, MoneyHelper.str2float("0"), 0.0);
        assertEquals(0.0F, MoneyHelper.str2float("0.00"), 0.0);
        assertEquals(1.01F, MoneyHelper.str2float("1.01"), 0.0);
        assertEquals(0.5F, MoneyHelper.str2float("0.50"), 0.0);
    }
    
}
