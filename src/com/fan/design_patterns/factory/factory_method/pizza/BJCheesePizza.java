package com.fan.design_patterns.factory.factory_method.pizza;

/**
 * @author fjw
 * @create 2020-12-03
 */
public class BJCheesePizza extends Pizza {

    public BJCheesePizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("BJCheesePizza正在准备中。。。。");
    }
}
