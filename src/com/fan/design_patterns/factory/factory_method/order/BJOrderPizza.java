package com.fan.design_patterns.factory.factory_method.order;

import com.fan.design_patterns.factory.factory_method.pizza.BJCheesePizza;
import com.fan.design_patterns.factory.factory_method.pizza.BJPepperPizza;
import com.fan.design_patterns.factory.factory_method.pizza.Pizza;

/**
 * 分店继承总店，并制作地方特色的pizza
 * @author fjw
 * @create 2020-12-03
 */
public class BJOrderPizza extends OrderPizza {


    /**
     * 地方店也有两种pizza
     * @param OrderType
     * @return
     */
    @Override
    Pizza createPizza(String OrderType) {
        Pizza pizza=null;
        if (OrderType.equals("cheese")){
            pizza = new BJCheesePizza("北京奶酪pizza");
        }else if (OrderType.equals("pepper")){
            pizza = new BJPepperPizza("北京胡椒pizza");
        }else {
            System.out.println("不好意思，本店无售");
        }

        return pizza;
    }


}