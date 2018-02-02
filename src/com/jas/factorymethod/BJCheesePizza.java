package com.jas.factorymethod;

import com.jas.simplefactory.Pizza;

public class BJCheesePizza extends Pizza {
    public BJCheesePizza(){
        name = "北京人喜欢吃的奶酪披萨";
        sauce = "浓浓的大蒜番茄酱";
    }

    /**
     * 覆盖curt() 方法将比萨切成块状
     */
    @Override
    public void cut(){
        System.out.println("把比萨饼切成方块状。");
    }
}
