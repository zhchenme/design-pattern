package com.jas.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * 包子菜单信息迭代器
 */
public class BZMenuIterator implements Iterator {
    List<MenuItem> menuItems;
    int position = 0;

    /**
     * 通过构造函数，实例化存储包子信息的菜单集合
     * @param menuItems
     */
    public BZMenuIterator(List<MenuItem> menuItems){
        this.menuItems = menuItems;
    }
    
    @Override
    public boolean hasNext() {
        if(position >= menuItems.size() || menuItems.get(position) == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position += 1;
        return menuItem;
    }
}
