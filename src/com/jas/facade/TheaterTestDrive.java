package com.jas.facade;

public class TheaterTestDrive {
    public static void main(String[] args) {
        
        Advertisement ads = new Advertisement();
        Light light = new Light();
        DVDPlayer dvdPlayer = new DVDPlayer();
        TheaterFacade facade = new TheaterFacade(ads, light, dvdPlayer);
        
        facade.watchMovie("复仇者联盟×");
        facade.endMovie();
    }
    /**
     * 输出
     * 现在开始播放广告，电影即将开始播放！
     * 广告播放结束！
     * 调整灯光亮度为：10%!
     * 现在开始播放电影，观看的电影是复仇者联盟×!
     * 调整灯光亮度为：100%!
     * 电影播放结束，请大家按秩序退场，关闭播放器！
     */
}
