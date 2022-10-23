package com.turchyn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        RockMusic rock = context.getBean("playRock", RockMusic.class);
        MusicPlayer musicRock = new MusicPlayer(rock);
        musicRock.playMusic();
        context.close();

        System.out.println(" ");
        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        ClassicMusic classic = context1.getBean("playClassic", ClassicMusic.class);
        MusicPlayer musicClassic = new MusicPlayer(classic);
        musicClassic.playMusic();

        System.out.println(" ");


        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("Bean.xml");
        MusicPlayer musicPlayer = context2.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();


//


    }
}