/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.john.pizza.repository;

import java.util.List;
import ua.com.john.pizza.domain.Order;

/**
 *
 * @author Иван Бородай
 */
public interface OrderRepository {
    Order create(Order o);
    
    List<Order> read();
    Order read(int id);
    
    Order update(Order o);
    void delete(int id);
    
    List<Order> getAll();
}
