package com.jas.simplefactory;

public abstract class Pizza {
    public String name;
    public String sauce;

    public void prepare(){
        System.out.println("准备 ..." + name);
        System.out.println("添加配料 ..." + sauce);
    }

    public void bake(){
        System.out.println("烘烤25分钟。");
    }

    public void cut(){
        System.out.println("把比萨饼切成对角片。");
    }

    public void box(){
        System.out.println("将披萨放到披萨商店的盒子中。");
    }
}
