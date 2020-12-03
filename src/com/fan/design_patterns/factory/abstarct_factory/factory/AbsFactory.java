package com.fan.design_patterns.factory.abstarct_factory.factory;

import com.fan.design_patterns.factory.abstarct_factory.pizza.Pizza;

/**
 * @author fjw
 * @create 2020-12-03
 */
public  interface AbsFactory {

     public Pizza createPizza(String orderType);

}
