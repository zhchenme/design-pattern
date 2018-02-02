package com.jas.iterator;

import java.util.Iterator;

/**
 * 沙县菜单迭代器
 */
public class SXMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position = 0;

    /**
     * 通过构造函数实例化存储沙县信息的菜单数组
     * @param menuItems
     */
    public SXMenuIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
    }
    
    @Override
    public boolean hasNext() {
        if(position >= menuItems.length || menuItems[position] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position += 1;
        return menuItem;
    }
}
