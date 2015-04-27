/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.john.pizza.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.springframework.stereotype.Repository;
import ua.com.john.pizza.domain.Order;

/**
 *
 * @author Иван Бородай
 */
@Repository
public class TestOrderRepositoryImpl implements OrderRepository{

    protected Map<Integer,Order> orders = new HashMap<>();
    protected Random rand = new Random();

    protected int genId(){
        return rand.nextInt();
    }
    
    @Override
    public Order create(Order o) {
        int id = genId();
        o.setId( id ); 
        orders.put(id, o);
        return o;
    }

    @Override
    public List<Order> read() {
        return new ArrayList<>(orders.values());
    }

    @Override
    public Order read(int id){
        return  orders.get(id);
    }

    @Override
    public Order update(Order o)throws IndexOutOfBoundsException {
        Integer id = o.getId();
        if( id == null ) throw new IndexOutOfBoundsException("Object with id "+id+" not found");
        orders.put(id, o);
        return o;
    }

    @Override
    public void delete(int id) {
        orders.remove(id);
    }
    
    @Override
    public List<Order> getAll(){
        return new ArrayList<>(orders.values());
    }
}