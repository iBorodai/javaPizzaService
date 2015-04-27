/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.john.pizza.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.john.pizza.domain.Pizza;
import ua.com.john.pizza.repository.PizzaRepository;

/**
 *
 * @author Иван Бородай
 */
@Service
public class PizzaServiceImpl implements PizzaService{

    private PizzaRepository repository;
    
    @Autowired
    public void setPizzaRepository(PizzaRepository repository){
        this.repository = repository;
        System.out.println( "[X] REPO: "+repository );
    }
    
    @Override
    public List<Pizza> getAllPizzas() {
        return repository.getAll();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
