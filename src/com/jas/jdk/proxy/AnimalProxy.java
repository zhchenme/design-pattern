package com.jas.jdk.proxy;

import java.lang.reflect.Proxy;

/**
 * @author Jas
 * @create 2018-02-01 10:03
 **/
public class AnimalProxy {
    /**
     * 返回代理代理对象
     * 
     * @param animal
     * @return
     */
    Animal getAnimal(Animal animal){
        /**
         * newProxyInstance() 方法有三个参数
         * 
         * newProxyInstance(ClassLoader loader,    -> 表示加载这个类的类加载器
         * Class<?>[] interfaces,   -> 代理类实现的接口列表。
         * InvocationHandler h)     -> InvocationHandler 控制对真实对象方法的访问
         */
        return (Animal) Proxy.newProxyInstance(animal.getClass().getClassLoader(), 
                animal.getClass().getInterfaces(), new OwnerInvocationHandler(animal));
    }
}
