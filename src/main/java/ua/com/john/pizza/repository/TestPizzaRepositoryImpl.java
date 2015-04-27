/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.john.pizza.repository;

import java.util.ArrayList;
import java.util.List;
import ua.com.john.pizza.domain.Pizza;

/**
 *
 * @author Иван Бородай
 */
public class TestPizzaRepositoryImpl implements PizzaRepository{

    protected List<Pizza> pizzas ;
    
    public TestPizzaRepositoryImpl(){
        this.pizzas = new ArrayList<>();
        System.out.println("[!] TestPizzaRepositoryImpl counstructor");
    }
    
    public void setPizzas(List<Pizza> pizzas){
        this.pizzas = pizzas;
    }
    
    @Override
    public final Pizza create(Pizza pizza) throws IllegalArgumentException {
        System.out.println( "add item "+pizza );
        pizzas.add( pizza );
        return pizza;
    }

    @Override
    public Pizza get(int id) throws IndexOutOfBoundsException{
        return pizzas.get(id);
    }
    
    @Override
    public Pizza update( int id, Pizza pizza ) throws IndexOutOfBoundsException,IllegalArgumentException{
        pizzas.set(id, pizza);
        return pizza;
    }

    @Override
    public void delete(int id) throws IndexOutOfBoundsException{
        this.pizzas.remove(id);
    }
    
    @Override
    public List<Pizza> getAll(){
        return pizzas;
    }
}
