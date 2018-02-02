package com.jas.command;

public class RemoteLoader {
    public static void main(String[] args) {
        
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Command onCommand = new LightOnCommand(light);
        Command offCommand = new LightOffCommand(light);
        
        remoteControl.setCommand(onCommand,offCommand);
        remoteControl.onButtonWasPushed();
        remoteControl.offButtonWasPushed();
    }
    /**
     * 输出
     * Light is on!
     * Light is off!
     */
}
