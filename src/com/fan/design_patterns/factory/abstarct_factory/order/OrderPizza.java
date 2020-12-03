package com.fan.design_patterns.factory.abstarct_factory.order;

import com.fan.design_patterns.factory.abstarct_factory.factory.AbsFactory;
import com.fan.design_patterns.factory.abstarct_factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

/**
 * @author fjw
 * @create 2020-12-03
 */
public class OrderPizza {

    AbsFactory factory;

    private void setAbsFactory(AbsFactory factory){


        Pizza pizza=null;

        this.factory = factory;
        // 订购披萨的类型
        String orderType;
        do {
            orderType=getType();
            //哪个子类指向了工厂实例就使用哪个子类的方法（可能是伦敦的工厂，也可能是北京的工厂）
            pizza = factory.createPizza(orderType);
            if (pizza!=null){
                //输出pizza制作过程
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("没有这种pizza，请重新订购");
            }

        }while (true);
    }


    // 构造器
    public OrderPizza(AbsFactory factory){
        setAbsFactory(factory);
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
