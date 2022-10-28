package com.turchyn;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component("rock")
public class RockMusic implements Music{
    private List <Song> rockMusic = new ArrayList<>();
    public RockMusic(){
        rockMusic.add(new Song("ACDC","Thunderstruck"));
        rockMusic.add(new Song("PAPA ROACH","Last Resort"));
    }

    public void playingMusic (){
        for (Song song : rockMusic) {
            System.out.println("play " + song);
        }
    }


}
