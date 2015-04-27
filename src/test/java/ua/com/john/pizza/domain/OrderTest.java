/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.john.pizza.domain;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
public class OrderTest {
    
    public OrderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    private Order instance;
    @Before
    public void setUp() {
        instance = new Order();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    private List<Pizza> initPizzas(){
        final List<Pizza> pizzas = new ArrayList<>();
        pizzas.add( new Pizza( PizzaType.Meat, "MeatPizza", 1.99f ) );
        pizzas.add( new Pizza( PizzaType.Sea, "SeaPizza", 2.99f ) );
        pizzas.add( new Pizza( PizzaType.Vegetarian, "VegetarianPizza", 3.99f ) );
        return pizzas;
    }
    
    /**
     * Test of getItems method, of class Order.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        
        Pizza p1 = new Pizza( PizzaType.Meat, "MeatPizza", 1.99f );
        Pizza p2 = new Pizza( PizzaType.Sea, "SeaPizza", 2.99f );
        
        final List<Pizza> pizzas = new ArrayList<>();
        pizzas.add( p1 );
        pizzas.add( p2 );
        instance.addItems( p1, p2 );
        
        assertEquals(pizzas,  instance.getItems() );
    }

    /**
     * Test of getId method, of class Order.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        
        assertEquals(0, instance.getId());
        
        instance.setId(2);
        assertEquals(2, instance.getId());
    }

    /**
     * Test of getPrice method, of class Order.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");

        assertEquals("0.00", instance.getPrice());
        
        instance.addItems( 
                new Pizza( PizzaType.Meat, "MeatPizza", 1.5f ), 
                new Pizza( PizzaType.Sea, "SeaPizza", 2.5f )
        );
        assertEquals("4.00", instance.getPrice());
        
    }

    /**
     * Test of getName method, of class Order.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");

        SimpleDateFormat form = new SimpleDateFormat("yyyymmdd-hhmm");
        String expName0 = form.format( new Date() ) + ":0";
        assertEquals(expName0, instance.getName());
        
        instance.setId(1);
        String expName = form.format( new Date() ) + ":1";
        assertEquals(expName, instance.getName());
    }

    /**
     * Test of setDate method, of class Order.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        
        Date date = null;
        instance.setDate(date);
        assertEquals(null, instance.getDate());
        
        Date date1 = new Date();
        instance.setDate(date1);
        assertEquals(date1, instance.getDate());
    }

    /**
     * Test of setId method, of class Order.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");

        instance.setId(10);
        assertEquals(10, instance.getId());
    }

    /**
     * Test of addItems method, of class Order.
     */
    @Test
    public void testAddItems() {
        System.out.println("addItems");
        
//        Pizza[] items = null;
//        instance.addItems(items);
//        assertEquals(items, instance.getItems());
        Pizza p1 = new Pizza(PizzaType.Sea, "Forst", 10.5F);
        Pizza p2 = new Pizza(PizzaType.Meat, "Second", 5.5F);
        Pizza[] items2 = {  p1, p2 };
        List<Pizza> ArrayList;
        List<Pizza> expRes = new ArrayList<>();
        expRes.add(p1); expRes.add(p2);
        
        instance.addItems(items2);
        assertEquals(expRes, instance.getItems());
    }

    /**
     * Test of removeItems method, of class Order.
     */
    @org.junit.Ignore
    @Test
    public void testRemoveItems() {
        System.out.println("removeItems");
        Pizza[] items = null;
        Order instance1 = new Order();
        instance1.removeItems(items);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Order.
     */
    @org.junit.Ignore
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Order instance1 = new Order();
        Date expResult = null;
        Date result = instance1.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
