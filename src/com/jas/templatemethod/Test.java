package com.jas.templatemethod;

public class Test {
    public static void main(String[] args) {
        
       /* CaffineBeverage coffee = new Coffee();
        CaffineBeverage tea = new Tea();
        
        coffee.prepareRecipe();
        System.out.println();
        tea.prepareRecipe();*/
       
       CaffineBeverageWithHook coffeeWithHook = new CoffeeWithHook();
       coffeeWithHook.prepareRecipe();
    }
    /**
     * 输出
     * 煮沸水！
     * 用沸水浸泡咖啡！
     * 倒进杯子里！
     * 你是否想要添加调料，请输入(y/n)
     * y
     * 加入糖与牛奶！
     */
}
