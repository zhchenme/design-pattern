package com.jas.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class BZMenu implements Menu{
    List<MenuItem> menuItems;
 
    /**
     * 通过构造函数，在菜单里添加一些菜品
     */
    public BZMenu() {
        menuItems = new ArrayList<>();

        addItem("雪菜包",1.0);
        addItem("灌汤包",1.0);
        addItem("韭菜包",1.0);
        addItem("猪肉包",1.0);
    }
    
    public void addItem(String name, double price){
        MenuItem menuItem = new MenuItem(name, price);
        menuItems.add(menuItem);
    }

    /**
     * 返回包子菜单信息的迭代器
     * @return
     */
    @Override
    public Iterator<MenuItem> createIterator() {
        return new BZMenuIterator(menuItems);
    }
}
