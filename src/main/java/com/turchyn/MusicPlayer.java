package com.turchyn;




public class MusicPlayer {
    private Music music;

    public MusicPlayer (Music music){
        this.music=music;
    }
    public void playMusic(){
        music.playingMusic();
    }




    public void init(){
        System.out.println("start plaing");
    }
    public void destroy(){
        System.out.println("The End");
    }
}
