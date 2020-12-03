package com.fan.design_patterns.factory.factory_method.pizza;

/**
 * @author fjw
 * @create 2020-12-03
 */
public class BJPepperPizza extends Pizza{

    public BJPepperPizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("BJPepperPizza正在准备中。。。");
    }
}
