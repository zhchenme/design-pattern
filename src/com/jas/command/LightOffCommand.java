package com.jas.command;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

        /**
         * 调用电灯关闭的方法
         */
    @Override
    public void execute() {
        light.off();
    }
}
