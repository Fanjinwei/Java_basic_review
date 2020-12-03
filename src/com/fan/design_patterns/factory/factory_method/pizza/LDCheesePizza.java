package com.fan.design_patterns.factory.factory_method.pizza;

/**
 * @author fjw
 * @create 2020-12-03
 */
public class LDCheesePizza extends Pizza {

    public LDCheesePizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("LDCheesePizza正在准备中。。。。");
    }
}
