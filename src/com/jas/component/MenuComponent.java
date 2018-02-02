package com.jas.component;

/**
 * @author Jas
 * @create 2018-01-30 10:23
 **/
public abstract class MenuComponent {
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    
    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }
    
    public String getName(){
        throw new UnsupportedOperationException();
    }
    
    public double getPrice(){
        throw new UnsupportedOperationException();
    }
    
    public void print(){
        throw new UnsupportedOperationException();
    }
    
}
