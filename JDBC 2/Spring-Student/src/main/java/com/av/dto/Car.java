package com.av.dto;

public class Car {
    public Car(PlayingMusic playmusic){
        super();
        this.playmusic = playmusic;
    }
    public PlayingMusic playmusic;

    public void setPlaymusic(PlayingMusic playmusic) {
        this.playmusic = playmusic;
    }
}
