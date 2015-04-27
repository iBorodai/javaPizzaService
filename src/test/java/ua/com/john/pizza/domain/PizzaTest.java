/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.john.pizza.domain;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 *
 * @author Иван Бородай
 */
public class PizzaTest {
    
    public PizzaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    private Pizza instance;
    @Before
    public void setUp() {
        instance = new Pizza();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of Pizza method, of class Pizza.
     */
    @org.junit.Test
    public void testPizza() {
        System.out.println("Pizza");
        
        PizzaType expType = null;
        String expName = "";
        float expPrice = 0.0f;
        
        assertEquals(expType, instance.getType());
        assertEquals(expName, instance.getName());
        assertEquals(expPrice, instance.getPrice(),0.0f);
    }

    /**
     * Test of getType method, of class Pizza.
     */
    @org.junit.Test
    public void testGetType() {
        System.out.println("getType");
        PizzaType expType = null;
        assertEquals(expType, instance.getType());
        instance.setType(PizzaType.Vegetarian);
        assertEquals(PizzaType.Vegetarian, instance.getType());
    }

    /**
     * Test of getName method, of class Pizza.
     */
    @org.junit.Test
    public void testGetName() {
        System.out.println("getName");
        assertEquals( "", instance.getName() );
        
        String v = "Super pizza";
        instance.setName(v);
        assertEquals(v, instance.getName());
    }

    /**
     * Test of getPrice method, of class Pizza.
     */
    @org.junit.Test
    public void testGetPrice() {
        System.out.println("getPrice");
        
        float expResult = 0.0F;
        assertEquals(expResult, instance.getPrice(), 0.0);
        
        float expResult1 = 9.99f;
        instance.setPrice(expResult1);
        assertEquals(expResult1, instance.getPrice(), 0.0);
    }

    /**
     * Test of setType method, of class Pizza.
     */
    @org.junit.Test
    public void testSetType() {
        System.out.println("setType");
        
        
        PizzaType type1 = PizzaType.Sea;
        instance.setType( type1 );
        assertEquals( type1, instance.getType() );
        
        PizzaType type2 = PizzaType.Vegetarian;
        instance.setType( type2 );
        assertEquals( type2, instance.getType() );

        PizzaType type = null;
        instance.setType(type);
        assertEquals(type, instance.getType());
    }

    /**
     * Test of setName method, of class Pizza.
     */
    @org.junit.Test
    public void testSetName() {
        System.out.println("setName");
        
        final List<String> strings = new ArrayList<>();

        strings.add("");
        strings.add("Super");
        strings.add(null);
        
        for (String next : strings) {
            instance.setName(next);
            assertEquals(next, instance.getName());
        }
    }

    /**
     * Test of setPrice method, of class Pizza.
     */
    @org.junit.Test
    public void testSetPrice() {
        System.out.println("setPrice");

        final List<Float> values = new ArrayList<>();

        values.add(0.0f);
        values.add(99.99f);
        
        for (Float next : values) {
            instance.setPrice(next);
            assertEquals(next, instance.getPrice(), 0.0f);
        }
    }
}
