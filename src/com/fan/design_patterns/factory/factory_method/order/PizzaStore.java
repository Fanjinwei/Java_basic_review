package com.fan.design_patterns.factory.factory_method.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author fjw
 * @create 2020-12-03
 */
public class PizzaStore {

    public static void main(String[] args) throws IOException {

        System.out.println("请问你想要订购哪个地方特色的pizza呢，" +"\n" +  "北京：BJ  伦敦:LD" + "\n" + "请输入对应的编号哦");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String msg = reader.readLine().toUpperCase();
        do {
            if (msg.equals("BJ")){
                new BJOrderPizza();
            }else if(msg.equals("LD")){
                new LDOrderPizza();
            }else {
                System.out.println("不好意思，暂时没有这种口味的哦，请重新选择");
            }
        }while (true);



    }
}
