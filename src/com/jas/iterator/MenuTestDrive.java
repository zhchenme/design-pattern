package com.jas.iterator;

public class MenuTestDrive {

    public static void main(String[] args) {
         
        BZMenu bzMenu = new BZMenu();
        SXMenu sxMenu = new SXMenu();
        Waitress waitress = new Waitress(bzMenu,sxMenu);
        
        waitress.printMenu();
        /**
         * 输出
         * 包子菜单为：
         * 雪菜包: 1.0
         * 灌汤包: 1.0
         * 韭菜包: 1.0
         * 猪肉包: 1.0
         * 沙县菜单为：
         * 青椒肉丝盖浇饭: 10.0
         * 西红柿鸡蛋盖浇饭: 10.0
         * 牛肉土豆煲仔饭: 15.0
         * 金针菇煲仔饭: 10.0
         */
    }
}
