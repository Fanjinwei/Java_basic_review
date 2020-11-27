package com.fan.design_patterns.factory.simple_factory.pizza;

/**
 * @author fjw
 * @create 2020-11-26
 */
public class GreekPizza extends Pizza {

    public GreekPizza(String pizzaName){
      super(pizzaName);
    }

    @Override
    public void prepare() {
        System.out.println("为制作希腊pizza准备原材料");
    }
}
