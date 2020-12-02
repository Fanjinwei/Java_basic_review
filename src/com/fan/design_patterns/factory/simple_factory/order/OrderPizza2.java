package com.fan.design_patterns.factory.simple_factory.order;

import com.fan.design_patterns.factory.simple_factory.SimpleFactory;
import com.fan.design_patterns.factory.simple_factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 简单工厂模式也被成为静态工厂模式
 *      好处：方便调用
 * @author fjw
 * @create 2020-12-02
 */
public class OrderPizza2 {


    public OrderPizza2(){
        setFactory();
    }


    public void setFactory(){

        do {
            String type = getType();

            Pizza pizza = SimpleFactory.createPizza2(type);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("目前还有许多优惠呢");
            }
        }while (true);

    }


    //写一个方法，可以获取客户希望订购的pizza种类
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
