package com.fan.design_patterns.singleTon.singleTon01;

/**
 * @author fjw
 * @create 2020-11-26
 */



public class SingleTon {

    public static void main(String[] args) {
        singleTon2 instance = singleTon2.getInstance();
        singleTon2 instance2 = singleTon2.getInstance();
        //证明得到的两个对象实例是同一个对象实例
        System.out.println(instance==instance2);  //true
        System.out.println(instance.hashCode());  //356573597
        System.out.println(instance2.hashCode()); //356573597
    }

}

/**
 * 单例模式
 *    饿汉式（静态变量）
 *      优点：在类加载的时候就创建了实例（所以称为饿汉式），不存在线程安全问题
 *      缺点： 没有达到懒加载的效果，会浪费内存
 * 使用场景：确定一定会用到该实例，避免造成不必要的内存浪费
 */
class singleTon1{
    //将构造器私有化  外部不能new
    private singleTon1(){

    };

    //本类内部创建对象实例（在类加载的时候创建）
    public final static singleTon1 instance = new singleTon1();

    //提供一个公有的静态方法，返回实例对象
    public static singleTon1 getInstance(){
        return instance;
    }

}

/**
 * 使用静态代码块的方式实现
 */
class singleTon2{

    //将构造器私有化  外部不能new
    private singleTon2(){

    };

    public final static singleTon2 instance;

    //静态代码块来创建实例对象
    static {
        instance=new singleTon2();
    }

    //提供一个公有的静态方法，返回实例对象
    public static singleTon2 getInstance(){
        return instance;
    }

}
