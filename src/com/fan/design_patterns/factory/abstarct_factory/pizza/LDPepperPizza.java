package com.fan.design_patterns.factory.abstarct_factory.pizza;

/**
 * @author fjw
 * @create 2020-12-03
 */
public class LDPepperPizza extends Pizza {
    public LDPepperPizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("LDPepperPizza正在准备中。。。");
    }
}
