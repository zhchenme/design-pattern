package com.jas.adapter;

import java.util.*;

public class DuckTestDrive {
    public static void main(String[] args) {
        
        WildTurkey wildTurkey = new WildTurkey();
        // 将火鸡包装进一个火鸡适配器中，使它看起来像一只鸭子
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);  
        
        System.out.println("\nThe TurkeyAdapter says ...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
        
        
                
    }
    /**
     * 输出 
     * The TurkeyAdapter says ...
     * Gobbble gobble!
     * I'm flying a short distance!
     * I'm flying a short distance!
     * I'm flying a short distance!
     * 
     */
}
