package com.jas.facade;

public class TheaterFacade {
    Advertisement ads;
    Light light;
    DVDPlayer dvdPlayer;
    
    public TheaterFacade(Advertisement ads, Light light, DVDPlayer dvdPlayer){
        this.ads = ads;
        this.light = light;
        this.dvdPlayer = dvdPlayer;
    }
    
    void watchMovie(String dvd){
        ads.on();
        ads.close();
        light.dim(10);
        dvdPlayer.on(dvd);
    }
    
    void endMovie(){
        light.dim(100);
        dvdPlayer.close();
    }
}
