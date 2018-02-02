package com.jas.factorymethod;

import com.jas.simplefactory.Pizza;

public class BJGreekPizza extends Pizza{
    public BJGreekPizza(){
        name = "北京人喜欢吃的希腊披萨";
        sauce = "浓浓的大蒜番茄酱";
    }
    
    @Override
    public void cut(){
        System.out.println("把比萨饼切成方块状。");
    }
}
