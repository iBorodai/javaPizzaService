/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.john.pizza.repository;

import java.util.List;
import ua.com.john.pizza.domain.Pizza;

/**
 *
 * @author Иван Бородай CRUD
 */
public interface PizzaRepository{
    Pizza get(int id);
    Pizza create(Pizza pizza);
    Pizza update(int id, Pizza pizza);
    void delete(int id);
    public List<Pizza> getAll();
}
