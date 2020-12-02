package com.fan.design_patterns.factory.simple_factory.order;

import com.fan.design_patterns.factory.simple_factory.SimpleFactory;

/**
 * @author fjw
 * @create 2020-11-26
 */
//相当于一个客户端
public class OrderStore {
    public static void main(String[] args) {


//        new OrderPizza(new SimpleFactory());
        new OrderPizza2();
    }
}
