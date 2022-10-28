package com.turchyn;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component("classic")
public class ClassicMusic implements Music {
    private List<Song> classicMusic=new ArrayList<>();

    public ClassicMusic(){
        classicMusic.add(new Song("Моцарт","Чарівна Флейта"));
        classicMusic.add(new Song("Шопен","Полонез"));
    }


    @Override
    public void playingMusic() {
        for (Song song : classicMusic) {
            System.out.println("play " + song);

        }
    }
}
