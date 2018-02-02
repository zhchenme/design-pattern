package com.jas.command;

public class CeilingFanHighCommand implements Command{
    CeilngFan ceilngFan;
    int prevSpeed;
    
    public CeilingFanHighCommand(CeilngFan ceilngFan){
        this.ceilngFan = ceilngFan;
    }
    
    @Override
    public void execute() {
        prevSpeed = ceilngFan.getSpeed();
        ceilngFan.high();
    }
    
    public void undo(){
        if(prevSpeed == CeilngFan.HIGH){
            ceilngFan.high();
        }else if(prevSpeed == CeilngFan.MEDIUM){
            ceilngFan.medium();
        }else if(prevSpeed == CeilngFan.LOW){
            ceilngFan.low();
        }else if(prevSpeed == CeilngFan.OFF){
            ceilngFan.off();
        }
    }
}
