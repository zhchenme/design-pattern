package com.jas.component;

/**
 *测试类
 * 
 * @author Jas
 * @create 2018-01-30 10:40
 **/
public class MenuTestDrive {
    public static void main(String[] args) {
        
        MenuComponent breakfastMenu = new Menu("早餐菜单");
        MenuComponent lunchMenu = new Menu("午餐菜单");
        MenuComponent dinnerMenu = new Menu("晚餐菜单");
        MenuComponent dessertMenu = new Menu("甜品菜单");
        /** 顶层菜单*/
        MenuComponent allMenus = new Menu("ALL MENUS LIST");
        
        breakfastMenu.add(new MenuItem("包子", 1.0));
        breakfastMenu.add(new MenuItem("豆浆",2.0));
        lunchMenu.add(new MenuItem("西红柿盖浇饭", 10.0));
        lunchMenu.add(new MenuItem("西红柿鸡蛋面",10.0));
        dinnerMenu.add(new MenuItem("热狗", 15.0));
        dessertMenu.add(new MenuItem("苹果派", 5.0));
        
        allMenus.add(breakfastMenu);
        allMenus.add(lunchMenu);
        allMenus.add(dinnerMenu);
        /** 将甜品菜单添加在晚餐菜单中*/
        dinnerMenu.add(dessertMenu);
        
        Waitress waitress = new Waitress(allMenus);
        waitress.print();
    }
    /**
     * 输出
     * ALL MENUS LIST
     * ====================
     *
     * 早餐菜单
     * ====================
     * 包子 1.0
     * 豆浆 2.0
     *
     * 午餐菜单
     * ====================
     * 西红柿盖浇饭 10.0
     * 西红柿鸡蛋面 10.0
     *
     * 晚餐菜单
     * ====================
     *  热狗 15.0
     *
     *  甜品菜单
     * ====================
     *  苹果派 5.0
     * 
     */
}
