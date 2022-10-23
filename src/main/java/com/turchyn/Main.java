package com.turchyn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        context.getBean("playRock", RockMusic.class).playingMusic();
        context.close();

        System.out.println("Main.main");
        ClassPathXmlApplicationContext context1=new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        context1.getBean("playClassic",ClassicMusic.class).playingMusic();




//


    }
}