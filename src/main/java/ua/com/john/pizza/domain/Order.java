/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ua.com.john.pizza.domain;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import ua.com.john.pizza.MoneyHelper;

/**
 *
 * @author Иван Бородай
 */
@Configuration
public class Order {
    private int id;
    private Date date;
    private List<Pizza> pizzas = new ArrayList<>();

    @Bean(name = "order")
    @Scope("prototype")
    public static Order CreateOrderBean() {
        return new Order();
    }
    
    
    public Order() {
        this.date = new Date();
    }
    public Order(List<Pizza> items){
        this.pizzas = items;
        this.date = new Date();
    }
    
    public List<Pizza> getItems() {
        return pizzas;
    }

    public int getId() {
        return id;
    }

    public String getPrice() {
        float p = 0;
        for (Pizza pizza : this.pizzas) {
            p += pizza.getPrice();
        }
        return MoneyHelper.float2str( p );
    }

    //name - Date+id
    public String getName() {
        SimpleDateFormat form = new SimpleDateFormat("yyyymmdd-hhmm");
        return form.format(this.date)
                + ':'
                + Integer.toString(this.id);
    }
    
    public Date getDate(){
        return this.date ;
    }
    
    public void setDate(Date date){
        this.date = date;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public void addItems( Pizza ... items ) {
        List<Pizza> l= Arrays.asList(items);
        pizzas.addAll( l ); 
    }
    public void removeItems( Pizza ... items ) {
        pizzas.removeAll(Arrays.asList(items));
    }
}