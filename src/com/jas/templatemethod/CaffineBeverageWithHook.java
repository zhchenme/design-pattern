package com.jas.templatemethod;

public abstract class CaffineBeverageWithHook {
  
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        /** 这里加上钩子的判断，只有钩子返回值为true 时，表示顾客想要加调料，才添加调料*/
        if(customerWantsCondiments()){
            addCondiments();
        }else {
            System.out.println("不添加任何调料");
        }
    }

    void boilWater(){
        System.out.println("煮沸水！");
    }

    abstract void brew();

    void pourInCup(){
        System.out.println("倒进杯子里！");
    }

    abstract void addCondiments();

    /**
     * 这是一个钩子，子类可以自行选择覆盖，但是也可以不这么做。
     * @return
     */
    boolean customerWantsCondiments(){
        return true;
    }
}
