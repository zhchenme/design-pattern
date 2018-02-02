package com.jas.command;

public class RemoteControl {
    Command onCommand;
    Command offComand;
    
    public RemoteControl(){}

    /**
     * 传入一组命令
     * 
     * @param onCommand 打开电灯的命令对象
     * @param offComand 关闭电灯的命令对象
     */
    public void setCommand(Command onCommand, Command offComand){
        this.onCommand = onCommand;
        this.offComand = offComand;
    }

    /**
     * 打开点灯的按钮，通过onCommand调用execute()方法
     */
    public void onButtonWasPushed(){
        //execute() 方法中封装了打开点灯的方法
        onCommand.execute();
    }

    /**
     * 关闭点灯的按钮，通过offComand调用execute()方法
     */
    public void offButtonWasPushed(){
        //execute() 方法中封装了关闭点灯的方法
        offComand.execute();
    }
}
