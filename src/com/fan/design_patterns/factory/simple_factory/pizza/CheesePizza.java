package com.fan.design_patterns.factory.simple_factory.pizza;

/**
 * @author fjw
 * @create 2020-11-26
 */
public class CheesePizza extends Pizza {

    public CheesePizza(String pizzaName){
        super(pizzaName);
    }

    @Override
    public void prepare() {
        System.out.println("为奶酪pizza准备原材料");
    }

}
