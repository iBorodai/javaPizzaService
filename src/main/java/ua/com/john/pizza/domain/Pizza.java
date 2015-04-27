/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.john.pizza.domain;

import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Иван Бородай
 */
public class Pizza {
    private PizzaType type;
    private String name;
    private float price;

    public Pizza() {
        this.name="";
        this.price=0.0f;
    }
    public Pizza(PizzaType pizzaType, String pizzaName, float pizzaPrice) {
        this.type = pizzaType;
        this.name = pizzaName;
        this.price = pizzaPrice;
    }    
    
    public PizzaType getType(){
        return type;
    }
    public String getName(){
        return name;
    }
    public float getPrice(){
        return price;
    }
    
    public void setType( PizzaType type ){
        this.type = type;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(float price){
        this.price = price;
    }
}
