/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.john.pizza.it;

import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ua.com.john.pizza.domain.Order;
import ua.com.john.pizza.domain.Pizza;
import ua.com.john.pizza.service.OrderService;
import ua.com.john.pizza.service.PizzaService;


/**
 *
 * @author Иван Бородай
 */
public class PizzaDeliveryTest extends ExtendedConfig{
    @Autowired
    private OrderService orderService;
    @Autowired
    private PizzaService pizzaService;
    
    @Test
    public void testPizzaDelivery(){
        List<Pizza> pizzas = pizzaService.getAllPizzas();
        
        System.out.println( pizzas );
//        
//        Order newOrder1 = orderService.createNewOrder();
//        newOrder1.addItems( pizzas.get(0) , pizzas.get(1) );
//        orderService.placeOrder( newOrder1 );
//
//        Order newOrder2 = orderService.createNewOrder();
//        newOrder2.addItems(pizzas.get(0));
//        orderService.placeOrder(newOrder2);
//        
//        List<Order> orders = orderService.getAllOrders();
//        
//        if( orders.size() > 0 ) {
//            System.out.println( "Existing orders:" );
//            for (Order order : orders) {
//                System.out.println( " - " + order.getName() );
//            }
//        }        
    }
}
