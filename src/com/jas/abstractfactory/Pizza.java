package com.jas.abstractfactory;

public abstract class Pizza {
    public String name;
    public Dough dough;
    public Cheese cheese;

    public abstract void prepare();

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
