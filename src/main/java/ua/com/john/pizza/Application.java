/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.john.pizza;

import java.util.Arrays;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.john.pizza.domain.Order;
import ua.com.john.pizza.domain.Pizza;
import ua.com.john.pizza.service.OrderService;
import ua.com.john.pizza.service.PizzaService;

/**
 *
 * @author Иван Бородай
 */
public class Application {
        
    public static void main (String args[]){
        ConfigurableApplicationContext appContextParent = 
                new ClassPathXmlApplicationContext("springConfigParent.xml");
System.out.println("Parent context:" );
        System.out.println( Arrays.toString(appContextParent.getBeanDefinitionNames()) );
        System.out.println("------------------" );
        
        ConfigurableApplicationContext appContext = 
                new ClassPathXmlApplicationContext( new String[] {"springConfigchild.xml"} , appContextParent);
System.out.println("Child context:" );        
        System.out.println( Arrays.toString(appContext.getBeanDefinitionNames()) );
        System.out.println("------------------" );
        
        PizzaService pizzaService = appContext.getBean(PizzaService.class);
        List<Pizza> pizzas = pizzaService.getAllPizzas();
        
        System.out.println( pizzas );
        
        OrderService orderService = appContext.getBean("orderService", OrderService.class);
        
        Order newOrder1 = orderService.createNewOrder();
        newOrder1.addItems( pizzas.get(0) , pizzas.get(1) );
        orderService.placeOrder( newOrder1 );

        Order newOrder2 = orderService.createNewOrder();
        newOrder2.addItems(pizzas.get(0));
        orderService.placeOrder(newOrder2);
        
        List<Order> orders = orderService.getAllOrders();
        
        if( orders.size() > 0 ) {
            System.out.println( "Existing orders:" );
            for (Order order : orders) {
                System.out.println( " - " + order.getName() );
            }
        }
    }
}
