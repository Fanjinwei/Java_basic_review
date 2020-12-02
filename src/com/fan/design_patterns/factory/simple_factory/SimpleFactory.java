package com.fan.design_patterns.factory.simple_factory;

import com.fan.design_patterns.factory.simple_factory.pizza.CheesePizza;
import com.fan.design_patterns.factory.simple_factory.pizza.GreekPizza;
import com.fan.design_patterns.factory.simple_factory.pizza.Pizza;

/**
 * @author fjw
 * @create 2020-11-26
 */
//简单工厂类
public class SimpleFactory {

    /**
     * 利用工厂来创建各种披萨实例
     * 将披萨的创建实例封装到该方法中
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType){
        Pizza pizza=null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")){
            pizza=new GreekPizza("greek");
        }else if (orderType.equals("cheese")){
            pizza = new CheesePizza("cheese");
        }else {
            System.out.println("没有这种pizza，请重新选购喔");
        }
        return pizza;
    }


    /**
     * 静态工厂模式
     * @param orderType
     * @return
     */
    public static  Pizza createPizza2(String orderType){
        Pizza pizza=null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")){
            pizza=new GreekPizza("greek");
        }else if (orderType.equals("cheese")){
            pizza = new CheesePizza("cheese");
        }else {
            System.out.println("没有这种pizza，请重新选购喔");
        }
        return pizza;
    }
}
