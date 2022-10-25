package com.turchyn;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        BeanFactory context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//
//        RockMusic rock = context.getBean("playRock", RockMusic.class);
//        MusicPlayer musicRock = new MusicPlayer(rock);
//        musicRock.playMusic();
//
//
//        System.out.println(" ");
//        BeanFactory context1 = new ClassPathXmlApplicationContext(
//                "applicationContext.xml");
//
//        ClassicMusic classic = context1.getBean("playClassic", ClassicMusic.class);
//        MusicPlayer musicClassic = new MusicPlayer(classic);
//        musicClassic.playMusic();
//
//        System.out.println(" ");

// xml
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

        ClassPathXmlApplicationContext contextAnotation=new ClassPathXmlApplicationContext(
                "annotation.xml");
        Music rock = contextAnotation.getBean("rock", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(rock);
        musicPlayer.playMusic();
        contextAnotation.close();




    }
}