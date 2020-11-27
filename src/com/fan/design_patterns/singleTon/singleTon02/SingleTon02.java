package com.fan.design_patterns.singleTon.singleTon02;

/**
 * @author fjw
 * @create 2020-11-26
 */
public class SingleTon02 {
    public static void main(String[] args) {

        singleTon3 instance = singleTon3.getInstance();
        singleTon3 instance2 = singleTon3.getInstance();
        //证明得到的两个对象实例是同一个对象实例
        System.out.println(instance==instance2);  //true
        System.out.println(instance.hashCode());  //356573597
        System.out.println(instance2.hashCode()); //356573597
    }
}

/**
 * 懒汉式（线程不安全写法）
 *      优点：采用了懒加载的方式（需要的时候才调用getInstance方法创建实例，避免不必要的内存浪费）
 *      缺点：线程不安全，实际开发中不要使用
 *          原因：在多线程情况下，如果有多个线程在进行if判断，则可能会创建多个实例对象，就破坏了单例模式
 */
class singleTon{
    
    private singleTon(){
        
    }
    
    public static singleTon instance;
    
    public static singleTon getInstance() {
        System.out.println("懒汉式，线程不安全");
        if (instance == null) {
            instance = new singleTon();
        }
        return instance;
    }
}

/**
 * 线程安全写法
 *      加锁 synchronized
 */

class singleTon1{

    private singleTon1(){

    }

    public static singleTon1 instance;

    /**
     * 提供了一个synchronized锁，解决了线程不安全问题
     * 缺点：效率太低，开发中不推荐使用
     * @return
     */
    public static synchronized singleTon1 getInstance() {
        System.out.println("懒汉式，线程安全,但效率低下");
        if (instance == null) {
            instance = new singleTon1();
        }
        return instance;
    }
}


/**
 * 采用双重检查的方式
 *      线程安全，并且效率高
 *          推荐使用
 */
class singleTon2{

    private singleTon2(){

    }
    //volatile作用：当instance一被修改就被刷新到主存去，相近与同步的效果
    public static volatile singleTon2 instance;

    /**
     * @return
     */
    public static  singleTon2 getInstance() {
        System.out.println("懒汉式，双重检查");
        if (instance == null) {
            synchronized(singleTon2.class){
                if (instance==null){
                    instance = new singleTon2();
                }
            }
        }
        return instance;
    }
}

/**
 * 使用静态内部类实现单例模式
 *      既是懒加载，又线程安全
 */
class singleTon3{

    private singleTon3(){

    }

    /**
     * 写一个内部静态类，它有一个内部属性
     *      内部静态类在singleTon3进行类加载的时候不会进行加载，也就满足了懒加载
     *      而在调用的时候才去加载静态内部类创建实例，这个过程在JVM中进行，是线程安全的
     *      推荐使用
     */
    public static class singleTonInstance{
        public  static  final singleTon3 INSTANCE = new singleTon3();
    }

    /**
     * @return
     */
    public static  singleTon3 getInstance() {
        System.out.println("使用静态内部类的方式，实现单例模式");
        return singleTonInstance.INSTANCE;
    }
}
