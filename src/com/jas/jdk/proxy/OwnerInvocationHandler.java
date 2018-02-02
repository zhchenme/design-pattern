package com.jas.jdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Jas
 * @create 2018-02-01 9:57
 **/
public class OwnerInvocationHandler implements InvocationHandler {
    /** 定义被代理的对象*/
    private Animal animal;

    /**
     * 通过构造函数实例化被代理的对象
     * 
     * @param animal
     */
    public OwnerInvocationHandler(Animal animal){
        this.animal = animal;
    }

    /**
     * 在cry 方法执行前后分别打印一句话  
     * 
     * @param proxy 正在返回的代理对象,一般不怎么使用该对象
     * @param method 正在被调用的方法
     * @param args 调用方法时，传入的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(("cry").equals(method.getName())){
            System.out.println("Before animal crying ...");
            // 执行当前的cry() 方法
            Object object = method.invoke(animal, args);
            System.out.println("After animal crying ...");
            
            return object;
        }

        /**
         * 如果调用的是其他方法，则直接执行
         */
        return method.invoke(animal, args); 
    }
}
