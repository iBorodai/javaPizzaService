/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.john.pizza.service;

import java.util.List;
import ua.com.john.pizza.domain.Pizza;

/**
 *
 * @author Иван Бородай
 */
public interface PizzaService {
    List<Pizza> getAllPizzas();
    //List<Pizza> getPizzasByType(PizzaType type);
}
