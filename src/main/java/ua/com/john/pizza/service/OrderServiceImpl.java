/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.john.pizza.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;
import ua.com.john.pizza.domain.Order;
import ua.com.john.pizza.repository.OrderRepository;

/**
 *
 * @author Иван Бородай
 */
@Service(value="orderService")
public class OrderServiceImpl implements OrderService{

    private OrderRepository repository;
    
    @Autowired
    public void setRepository(OrderRepository repository){
        this.repository = repository;
    }

    @Lookup
    @Override
    public Order createNewOrder(){
        return null;
    };

    @Override
    public List<Order> getAllOrders() {
        return repository.getAll();
    }

    @Override
    public Order getOrderById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public Order placeOrder(Order order) {
        return repository.create(order);
    }    
}
