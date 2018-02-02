package com.jas.component;

/**
 * 招待员类
 * 
 * @author Jas
 * @create 2018-01-30 10:39
 **/
public class Waitress {
    MenuComponent allMenus;
    
    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }
    
    public void print(){
        allMenus.print();
    }
}
