package com.fan.design_patterns.singleTon.singleTon03;



/**
 * @author fjw
 * @create 2020-11-26
 */
public class SingleTon { public static void main(String[] args) {

    SingleTon1 instance = SingleTon1.INSTANCE;
    SingleTon1 instance2 = SingleTon1.INSTANCE;
    //证明得到的两个对象实例是同一个对象实例
    System.out.println(instance==instance2);  //true
    System.out.println(instance.hashCode());  //356573597
    System.out.println(instance2.hashCode()); //356573597
}

}

/**
 * 使用枚举方式实现单例模式
 *      效率高，避免了线程安全问题，而且可以避免使用反序列化破坏单例模式
 *      推荐使用
 */
enum SingleTon1{
    INSTANCE;
    public void sayOk(){
        System.out.println("Ok~");
    }
}