package com.turchyn;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component("rock")
public class RockMusic implements Music{
    private List <Song> rockMusic = new ArrayList<>();
    public RockMusic(){
        rockMusic.add(new Song("Rock1","trek1"));
        rockMusic.add(new Song("Rock2","trek2"));
    }

    public void playingMusic (){
        for (Song song : rockMusic) {
            System.out.println("play " + song);
        }
    }


}
