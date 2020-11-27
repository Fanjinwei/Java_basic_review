package com.fan.design_patterns.factory.simple_factory.order;

import com.fan.design_patterns.factory.simple_factory.SimpleFactory;
import com.fan.design_patterns.factory.simple_factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author fjw
 * @create 2020-11-26
 */

public class OrderPizza {

//    public OrderPizza(){
//        Pizza pizza=null;
//        String orderType;
//        do {
//            orderType=getType();
//            if (orderType.equals("greek")){
//                pizza=new GreekPizza("greek");
//            }else if (orderType.equals("cheese")){
//                pizza = new CheesePizza("cheese");
//            }else {
//                System.out.println("没有这种pizza，请重新选购喔");
//                break;
//            }
//            //输出pizza制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while (true);
//    }

    //定义一个简单工厂对象
    SimpleFactory simpleFactory;
    //使用聚合的方式控制工厂对象
    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }
    public void setFactory(SimpleFactory simpleFactory){
        this.simpleFactory = simpleFactory; //设置简单工厂对象

        do {
            String type = getType();

           Pizza  pizza = simpleFactory.createPizza(type);
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
