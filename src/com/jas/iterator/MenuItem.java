package com.jas.iterator;

/**
 * 用来封装菜单食物信息
 */
public class MenuItem {
    String name;   
    double price;
    
    public MenuItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
