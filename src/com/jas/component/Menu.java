package com.jas.component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 菜单类，
 * 
 * getName() 方法返回具体菜单名
 * add(MenuComponent menuComponent) 方法表示添加菜单
 * remove(MenuComponent menuComponent) 删除一个菜单
 * getChild(int i) 返回一个指定的菜单
 * print() 用于输出菜单名和具体菜单菜品信息，也是所有代码中最难理解的一部分
 * 
 * @author Jas
 * @create 2018-01-30 10:30
 **/
public class Menu extends MenuComponent {
    /** menuComponents 用来保存早中晚的菜单项。 */
    List<MenuComponent> menuComponents = new ArrayList<>();
    /** name 表示菜单名(早中晚甜品)*/
    String name;
    
    public Menu(String name){
        this.name = name;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    /**
     * 既可以输出菜单名，也可以输出菜单中的菜品名
     */
    @Override
    public void print() {
        System.out.println("\n" + getName());
        System.out.println("====================");

        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }
}
