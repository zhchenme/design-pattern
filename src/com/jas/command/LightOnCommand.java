package com.jas.command;

public class LightOnCommand implements Command {
    Light light;

    /**
     * 通过构造器实力化light 对象，在execute() 方法中调用其对应的打开与关闭方法
     * 
     * @param light
     */
    public LightOnCommand(Light light){
        this.light = light;
    }

    /**
     * 调用电灯打开的方法
     */
    @Override
    public void execute() {
        light.on();
    }
}
