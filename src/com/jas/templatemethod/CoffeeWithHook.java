package com.jas.templatemethod;

import java.util.Scanner;

public class CoffeeWithHook  extends CaffineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("用沸水浸泡咖啡！");
    }

    @Override
    void addCondiments() {
        System.out.println("加入糖与牛奶！");
    }

    @Override
    boolean customerWantsCondiments() {
        /** 只有当用户输入的是'y'时，返回true，才添加调料 */
        if("y".equals(getUserInput())){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 获得用户在控制台输入的数据
     * @return
     */
    private String getUserInput(){
        String answer = null;
        System.out.println("你是否想要添加调料，请输入(y/n)");

        Scanner read = new Scanner(System.in);
        answer = read.nextLine();
        
        return answer;
    }
}
