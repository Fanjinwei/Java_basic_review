package com.fan.design_patterns.factory.factory_method.pizza;

/**
 * 将pizza设计成抽象类
 * @author fjw
 * @create 2020-11-26
 */
public abstract class Pizza {

    protected  String name;

    public Pizza(String name){
        this.name=name;
    }

    //准备原材料，因为不同的pizza原材料是不同的，所以将其设置为抽象方法，让使用者去实现
    public abstract void prepare();

    public void bake(){
        System.out.println(name + "backing;");
    }

    public void cut(){
        System.out.println(name + "cutting;");
    }

    public void box(){
        System.out.println(name + "boxing;");
    }
}
