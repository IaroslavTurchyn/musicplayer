package com.turchyn;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext contextRock = new ClassPathXmlApplicationContext(
                "Bean.xml");
        MusicPlayer musicPlayer = contextRock.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(" ");
        contextRock.close();

        ClassPathXmlApplicationContext contextClassic=new ClassPathXmlApplicationContext(
                "Bean.xml");
            contextClassic.getBean("musicClassic",MusicPlayer.class).playMusic();
            contextClassic.close();

//anotation

        System.out.println("-----------------");
        ClassPathXmlApplicationContext contextAnotation=new ClassPathXmlApplicationContext(
                "annotation.xml");
        Music rock = contextAnotation.getBean("rock", Music.class);
        MusicPlayer musicPlayerAnnotation = new MusicPlayer(rock);
        musicPlayerAnnotation.playMusic();
        contextAnotation.close();




    }
}