package com.jas.component;

/**
 * 菜单项类实现，用来封装菜品信息
 * 
 * getName() 方法返回菜品名字
 * getPrice() 方法返回菜品价格
 * print() 输出该菜品的详细信息
 * 
 * @author Jas
 * @create 2018-01-30 10:26
 **/
public class MenuItem extends MenuComponent{
    String name;
    double price;
    
    public MenuItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.print(" " + getName());
        System.out.println(" " + getPrice());
    }
}
