package com.jas.facade;

public class DVDPlayer {
    void on(String dvd){
        System.out.println("现在开始播放电影，观看的电影是" + dvd + "!");
    }
    void close(){
        System.out.println("电影播放结束，请大家按秩序退场，关闭播放器！");
    }
}
