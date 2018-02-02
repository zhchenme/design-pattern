package com.jas.command;

public class CeilngFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int speed;
    
    public void high(){
        speed = HIGH;
    }
    
    public void medium(){
        speed = MEDIUM;
    }
    
    public void low(){
        speed = LOW;
    }
    
    public void off(){
        speed = OFF;
    }
    
    public int getSpeed(){
        return speed;
    }
}
