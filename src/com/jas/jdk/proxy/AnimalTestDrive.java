package com.jas.jdk.proxy;

import java.lang.reflect.Proxy;

/**
 * @author Jas
 * @create 2018-02-01 10:05
 **/
public class AnimalTestDrive {
    public static void main(String[] args) {
        
        Animal dog = new AnimalProxy().getAnimal(new Dog());
        Animal cat = new AnimalProxy().getAnimal(new Cat());
        
        dog.cry();
        dog.eat();
        
        System.out.println("================");
        cat.cry();
        cat.eat();
        
        System.out.println(Proxy.isProxyClass(dog.getClass()));
            
    }
    /**
     * 输出
     * Before animal crying ...
     * Dog wang wang ...
     * After animal crying ...
     * Dog eat ...
     * ================
     * Before animal crying ...
     * Cat miao miao ...
     * After animal crying ...
     * Cat eat ...
     */
}
