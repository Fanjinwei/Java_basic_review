package com.fan.design_patterns.factory.factory_method.order;


import com.fan.design_patterns.factory.factory_method.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author fjw
 * @create 2020-12-03
 */
public abstract class OrderPizza {

    //定义一个抽象方法，createPizza , 让各个工厂子类自己实现
     abstract Pizza createPizza(String OrderType);


    // 构造器
        public OrderPizza(){
        Pizza pizza=null;
            // 订购披萨的类型
        String orderType;
        do {
            orderType=getType();
            //抽象方法，由工厂子类完成
            pizza = createPizza(orderType);
            //输出pizza制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }


    public String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
